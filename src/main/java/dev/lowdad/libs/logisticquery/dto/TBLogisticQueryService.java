package dev.lowdad.libs.logisticquery.dto;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 菜鸟裹裹物流查询服务
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public class TBLogisticQueryService implements LogisticQueryService {

    private final LogisticProvider provider = LogisticProvider.TAOBAO;
    private final RestTemplate restTemplate;
    private static String cookie_t = "031dd6a0d866991501b6e96934122ddd_1610424909654;b606272e19fd583d592d5d9efe18442e";
    private static HttpHeaders httpHeaders;

    public TBLogisticQueryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        httpHeaders = new HttpHeaders();//header参数
        List<String> cookies = new ArrayList<>();
        cookies.add("cna=3EndFscxuTsCAbaWdE9fRKka");
        cookies.add("_m_h5_tk=bf83f17dd68b99402d216f56515dac48_1610363612286");
        cookies.add("_m_h5_tk_enc=9411194c04acd9af3d16a32a8e3db5d4");
        httpHeaders.put(HttpHeaders.COOKIE, cookies);
    }


    public LogisticInfoDTO queryByNo(String no) {
        Map<String, Object> params = new HashMap<>(this.provider.getConfigs());
        final long timestamp = new Date().getTime();
        String token = cookie_t.split("_")[0];
        String data = "{\"mailNo\": \"" + no + "\", \"cpCode\":\"\"}";
        String sign = sign(timestamp, data);
        params.put("t", timestamp);
        params.put("sign", sign);
        params.put("c", token);
        params.put("data", data);
        String url = this.provider.getApi() + "?jsv={jsv}&appKey={appKey}&t={t}&sign={sign}&api={api}&AntiCreep={AntiCreep}&timeout={timeout}&v={v}&type={type}&dataType={dataType}&c={c}&data={data}";
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        final ResponseEntity<TBLogisticDetailDTO> entity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, TBLogisticDetailDTO.class, params);
        if (entity.hasBody() && entity.getBody()!=null && entity.getStatusCode().equals(HttpStatus.OK)) {
            final TBLogisticDetailDTO body = entity.getBody();
            if (body.getRet().stream().noneMatch(s -> s.equals("SUCCESS::调用成功"))) {
                final List<String> cookies = entity.getHeaders().get("set-cookie");
                if (cookies == null || cookies.size() < 3) {
                    return null;
                } else {
                    final List<String> newCookie = cookies.stream().map(c -> c.split(";")[0]).collect(Collectors.toList());
                    httpHeaders.put(HttpHeaders.COOKIE, newCookie);
                    cookie_t = newCookie.get(1).split("=")[1];
                    String newSign = sign(timestamp, data);
                    params.put("sign", newSign);
                    return queryByNo(no);
                }
            } else {
                return translate(entity.getBody());
            }
        } else {
            return null;
        }
    }

    private String sign(long timestamp, String data) {
        return MD5Utils.encode(cookie_t.split("_")[0] + "&" + timestamp + "&" + this.provider.getConfigs().get("appKey") + "&" + data);
    }

    private LogisticInfoDTO translate(TBLogisticDetailDTO dto) {
        final TBLogisticDetailDTO.DataBean data = dto.getData();
        LogisticInfoDTO info = new LogisticInfoDTO();
        info.setCompanyCode(data.getPartnerCode());
        info.setCompanyName(data.getPartnerName());
        info.setCompanyIcon(data.getPartnerIconUrl());
        info.setLogisticNo(data.getMailNo());
        info.setDeliveryName(data.getDeliveryName());
        info.setDeliveryMobile(data.getDeliveryContact());
        info.setServiceTel(data.getCpCompanyInfo().getServiceTel());
        info.setStatus(data.getLogisticStatusDesc());
        Collections.reverse(data.getTransitList());
        info.setNodes(data.getTransitList().stream().map(t -> {
            LogisticNode node = new LogisticNode();
            node.setNodeIcon(t.getSectionIcon());
            node.setNodeMessage(t.getMessage());
            node.setNodeTimeRecord(t.getTime());
            return node;
        }).collect(Collectors.toList()));
        return info;
    }
}
