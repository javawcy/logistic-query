package dev.lowdad.libs.logisticquery.dto;

import java.io.Serializable;

/**
 * <p>
 * 快递节点信息
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public class LogisticNode implements Serializable {
    private static final long serialVersionUID = 4763232982272591085L;

    private String nodeMessage;
    private String nodeIcon;
    private String nodeTimeRecord;

    public String getNodeMessage() {
        return nodeMessage;
    }

    public void setNodeMessage(String nodeMessage) {
        this.nodeMessage = nodeMessage;
    }

    public String getNodeIcon() {
        return nodeIcon;
    }

    public void setNodeIcon(String nodeIcon) {
        this.nodeIcon = nodeIcon;
    }

    public String getNodeTimeRecord() {
        return nodeTimeRecord;
    }

    public void setNodeTimeRecord(String nodeTimeRecord) {
        this.nodeTimeRecord = nodeTimeRecord;
    }
}
