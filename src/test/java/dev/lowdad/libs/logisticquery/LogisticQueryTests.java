package dev.lowdad.libs.logisticquery;

import dev.lowdad.libs.logisticquery.dto.LogisticInfoDTO;
import dev.lowdad.libs.logisticquery.dto.LogisticQueryService;
import dev.lowdad.libs.logisticquery.dto.TBLogisticQueryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 测试查询
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public class LogisticQueryTests extends LogisticQueryApplicationTests{

    private final LogisticQueryService logisticQueryService;

    public LogisticQueryTests() {
        RestTemplate restTemplate = new RestTemplate();
        this.logisticQueryService = new TBLogisticQueryService(restTemplate);
    }

    @Test
    void testQueryByNo() {
        String logisticNo = "4606488392029";
        final LogisticInfoDTO dto = logisticQueryService.queryByNo(logisticNo);
        Assertions.assertNotNull(dto);
    }
}
