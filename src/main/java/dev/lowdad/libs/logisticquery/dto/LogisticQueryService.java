package dev.lowdad.libs.logisticquery.dto;

/**
 * <p>
 * 物流查询服务接口
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public interface LogisticQueryService {

    LogisticInfoDTO queryByNo(String no);
}
