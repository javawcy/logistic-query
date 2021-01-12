package dev.lowdad.libs.logisticquery.dto;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 物流信息DTO
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public class LogisticInfoDTO implements Serializable {
    private static final long serialVersionUID = -7584465976138734041L;

    /**
     * 单号
     */
    private String logisticNo;

    /**
     * 物流公司信息
     */
    private String companyName;
    private String companyCode;
    private String companyIcon;
    private String serviceTel;

    /**
     * 配送信息
     */
    private String deliveryName;
    private String deliveryMobile;
    private String status;

    /**
     * 详情节点
     */
    private List<LogisticNode> nodes;

    public String getLogisticNo() {
        return logisticNo;
    }

    public void setLogisticNo(String logisticNo) {
        this.logisticNo = logisticNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyIcon() {
        return companyIcon;
    }

    public void setCompanyIcon(String companyIcon) {
        this.companyIcon = companyIcon;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryMobile() {
        return deliveryMobile;
    }

    public void setDeliveryMobile(String deliveryMobile) {
        this.deliveryMobile = deliveryMobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LogisticNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<LogisticNode> nodes) {
        this.nodes = nodes;
    }
}
