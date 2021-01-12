package dev.lowdad.libs.logisticquery.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * 查询配置
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
@ConfigurationProperties("logistic.query")
public class QueryConfigProperties {

    private String provider = "TAOBAO";

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
