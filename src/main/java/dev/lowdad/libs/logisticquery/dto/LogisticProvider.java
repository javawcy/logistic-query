package dev.lowdad.libs.logisticquery.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 快递查询提供
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public enum LogisticProvider {
    TAOBAO(
            "菜鸟裹裹",
            "https://h5api.m.taobao.com/h5/mtop.cnwireless.cnlogisticdetailservice.wapquerylogisticpackagebymailno/1.0/",
            new HashMap<String,Object>() {
                private static final long serialVersionUID = 1040528407550782218L;
                {
                    put("jsv", "2.4.2");
                    put("appKey", "12574478");
                    put("api", "mtop.cnwireless.CNLogisticDetailService.wapqueryLogisticPackageByMailNo");
                    put("AntiCreep", true);
                    put("timeout", 5000);
                    put("v", 1.0);
                    put("type", "originaljson");
                    put("dataType", "json");
                }
            }
    )
    ;
    private final String provider;
    private final String api;
    private final Map<String, Object> configs;

    LogisticProvider(String provider, String api, Map<String, Object> configs) {
        this.provider = provider;
        this.api = api;
        this.configs = configs;
    }

    public String getProvider() {
        return provider;
    }

    public String getApi() {
        return api;
    }

    public Map<String, Object> getConfigs() {
        return configs;
    }
}
