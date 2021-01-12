package dev.lowdad.libs.logisticquery.dto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * <p>
 *
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
@Configuration
@EnableConfigurationProperties(QueryConfigProperties.class)
@ConditionalOnWebApplication
public class QueryConfig {

    private final QueryConfigProperties config;
    private final RestTemplate restTemplate;

    public QueryConfig(QueryConfigProperties config) {
        this.config = config;
        this.restTemplate = new RestTemplate();
    }

    @Bean
    public LogisticQueryService logisticQueryService() {
        final LogisticProvider provider = Arrays.stream(LogisticProvider.values()).filter(p -> p.name().equals(config.getProvider()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("logistic provider not available"));
        switch (provider) {
            case TAOBAO:
                return new TBLogisticQueryService(restTemplate);
            default:
                throw new IllegalArgumentException("logistic provider not available");
        }
    }
}
