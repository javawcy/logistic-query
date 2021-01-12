package dev.lowdad.libs.logisticquery.dto;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 菜鸟裹裹物流详情DTO
 * </P>
 *
 * @author Chongyu
 * @since 2021/1/12
 */
public class TBLogisticDetailDTO implements Serializable {
    private static final long serialVersionUID = -4289138962695160734L;


    private String api;
    private DataBean data;
    private String v;
    private List<String> ret;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public List<String> getRet() {
        return ret;
    }

    public void setRet(List<String> ret) {
        this.ret = ret;
    }

    public static class DataBean {
        private String backGroundColorValue;
        private int buyerUserId;
        private boolean canEnterPackageMapMode;
        private CpCompanyInfoBean cpCompanyInfo;
        private boolean cupboardPackage;
        private String deliveryContact;
        private String deliveryName;
        private int evaluateStatus;
        private boolean hasBeenPingjia;
        private boolean hasWarningInfo;
        private boolean isProxyOrder;
        private String logisticStatus;
        private String logisticStatusDesc;
        private String logisticsOrderGmtCreate;
        private String mailNo;
        private String operatorContact;
        private int packageCategory;
        private PackageStatusBean packageStatus;
        private String partnerCode;
        private String partnerContactPhone;
        private String partnerIconUrl;
        private String partnerName;
        private String pingjiaUrl;
        private boolean schoolStation;
        private String sentScanTime;
        private boolean showAppointment;
        private boolean showCPBackground;
        private boolean showComplain;
        private boolean showEvaluation;
        private boolean showPackageForecast;
        private boolean showPingjiaEnter;
        private boolean stationPackage;
        private int taobaoTradeId;
        private boolean tbPackage;
        private List<TransitListBean> transitList;

        public String getBackGroundColorValue() {
            return backGroundColorValue;
        }

        public void setBackGroundColorValue(String backGroundColorValue) {
            this.backGroundColorValue = backGroundColorValue;
        }

        public int getBuyerUserId() {
            return buyerUserId;
        }

        public void setBuyerUserId(int buyerUserId) {
            this.buyerUserId = buyerUserId;
        }

        public boolean isCanEnterPackageMapMode() {
            return canEnterPackageMapMode;
        }

        public void setCanEnterPackageMapMode(boolean canEnterPackageMapMode) {
            this.canEnterPackageMapMode = canEnterPackageMapMode;
        }

        public CpCompanyInfoBean getCpCompanyInfo() {
            return cpCompanyInfo;
        }

        public void setCpCompanyInfo(CpCompanyInfoBean cpCompanyInfo) {
            this.cpCompanyInfo = cpCompanyInfo;
        }

        public boolean isCupboardPackage() {
            return cupboardPackage;
        }

        public void setCupboardPackage(boolean cupboardPackage) {
            this.cupboardPackage = cupboardPackage;
        }

        public String getDeliveryContact() {
            return deliveryContact;
        }

        public void setDeliveryContact(String deliveryContact) {
            this.deliveryContact = deliveryContact;
        }

        public String getDeliveryName() {
            return deliveryName;
        }

        public void setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
        }

        public int getEvaluateStatus() {
            return evaluateStatus;
        }

        public void setEvaluateStatus(int evaluateStatus) {
            this.evaluateStatus = evaluateStatus;
        }

        public boolean isHasBeenPingjia() {
            return hasBeenPingjia;
        }

        public void setHasBeenPingjia(boolean hasBeenPingjia) {
            this.hasBeenPingjia = hasBeenPingjia;
        }

        public boolean isHasWarningInfo() {
            return hasWarningInfo;
        }

        public void setHasWarningInfo(boolean hasWarningInfo) {
            this.hasWarningInfo = hasWarningInfo;
        }

        public boolean isIsProxyOrder() {
            return isProxyOrder;
        }

        public void setIsProxyOrder(boolean isProxyOrder) {
            this.isProxyOrder = isProxyOrder;
        }

        public String getLogisticStatus() {
            return logisticStatus;
        }

        public void setLogisticStatus(String logisticStatus) {
            this.logisticStatus = logisticStatus;
        }

        public String getLogisticStatusDesc() {
            return logisticStatusDesc;
        }

        public void setLogisticStatusDesc(String logisticStatusDesc) {
            this.logisticStatusDesc = logisticStatusDesc;
        }

        public String getLogisticsOrderGmtCreate() {
            return logisticsOrderGmtCreate;
        }

        public void setLogisticsOrderGmtCreate(String logisticsOrderGmtCreate) {
            this.logisticsOrderGmtCreate = logisticsOrderGmtCreate;
        }

        public String getMailNo() {
            return mailNo;
        }

        public void setMailNo(String mailNo) {
            this.mailNo = mailNo;
        }

        public String getOperatorContact() {
            return operatorContact;
        }

        public void setOperatorContact(String operatorContact) {
            this.operatorContact = operatorContact;
        }

        public int getPackageCategory() {
            return packageCategory;
        }

        public void setPackageCategory(int packageCategory) {
            this.packageCategory = packageCategory;
        }

        public PackageStatusBean getPackageStatus() {
            return packageStatus;
        }

        public void setPackageStatus(PackageStatusBean packageStatus) {
            this.packageStatus = packageStatus;
        }

        public String getPartnerCode() {
            return partnerCode;
        }

        public void setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
        }

        public String getPartnerContactPhone() {
            return partnerContactPhone;
        }

        public void setPartnerContactPhone(String partnerContactPhone) {
            this.partnerContactPhone = partnerContactPhone;
        }

        public String getPartnerIconUrl() {
            return partnerIconUrl;
        }

        public void setPartnerIconUrl(String partnerIconUrl) {
            this.partnerIconUrl = partnerIconUrl;
        }

        public String getPartnerName() {
            return partnerName;
        }

        public void setPartnerName(String partnerName) {
            this.partnerName = partnerName;
        }

        public String getPingjiaUrl() {
            return pingjiaUrl;
        }

        public void setPingjiaUrl(String pingjiaUrl) {
            this.pingjiaUrl = pingjiaUrl;
        }

        public boolean isSchoolStation() {
            return schoolStation;
        }

        public void setSchoolStation(boolean schoolStation) {
            this.schoolStation = schoolStation;
        }

        public String getSentScanTime() {
            return sentScanTime;
        }

        public void setSentScanTime(String sentScanTime) {
            this.sentScanTime = sentScanTime;
        }

        public boolean isShowAppointment() {
            return showAppointment;
        }

        public void setShowAppointment(boolean showAppointment) {
            this.showAppointment = showAppointment;
        }

        public boolean isShowCPBackground() {
            return showCPBackground;
        }

        public void setShowCPBackground(boolean showCPBackground) {
            this.showCPBackground = showCPBackground;
        }

        public boolean isShowComplain() {
            return showComplain;
        }

        public void setShowComplain(boolean showComplain) {
            this.showComplain = showComplain;
        }

        public boolean isShowEvaluation() {
            return showEvaluation;
        }

        public void setShowEvaluation(boolean showEvaluation) {
            this.showEvaluation = showEvaluation;
        }

        public boolean isShowPackageForecast() {
            return showPackageForecast;
        }

        public void setShowPackageForecast(boolean showPackageForecast) {
            this.showPackageForecast = showPackageForecast;
        }

        public boolean isShowPingjiaEnter() {
            return showPingjiaEnter;
        }

        public void setShowPingjiaEnter(boolean showPingjiaEnter) {
            this.showPingjiaEnter = showPingjiaEnter;
        }

        public boolean isStationPackage() {
            return stationPackage;
        }

        public void setStationPackage(boolean stationPackage) {
            this.stationPackage = stationPackage;
        }

        public int getTaobaoTradeId() {
            return taobaoTradeId;
        }

        public void setTaobaoTradeId(int taobaoTradeId) {
            this.taobaoTradeId = taobaoTradeId;
        }

        public boolean isTbPackage() {
            return tbPackage;
        }

        public void setTbPackage(boolean tbPackage) {
            this.tbPackage = tbPackage;
        }

        public List<TransitListBean> getTransitList() {
            return transitList;
        }

        public void setTransitList(List<TransitListBean> transitList) {
            this.transitList = transitList;
        }

        public static class CpCompanyInfoBean {
            private String companyCode;
            private String companyName;
            private String iconUrl100x100;
            private String iconUrl102x38;
            private String iconUrl16x16;
            private String iconUrl288x72;
            private String iconUrl36x36;
            private String iconUrl56x56;
            private String pinyin;
            private String serviceTel;
            private String webUrl;

            public String getCompanyCode() {
                return companyCode;
            }

            public void setCompanyCode(String companyCode) {
                this.companyCode = companyCode;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public String getIconUrl100x100() {
                return iconUrl100x100;
            }

            public void setIconUrl100x100(String iconUrl100x100) {
                this.iconUrl100x100 = iconUrl100x100;
            }

            public String getIconUrl102x38() {
                return iconUrl102x38;
            }

            public void setIconUrl102x38(String iconUrl102x38) {
                this.iconUrl102x38 = iconUrl102x38;
            }

            public String getIconUrl16x16() {
                return iconUrl16x16;
            }

            public void setIconUrl16x16(String iconUrl16x16) {
                this.iconUrl16x16 = iconUrl16x16;
            }

            public String getIconUrl288x72() {
                return iconUrl288x72;
            }

            public void setIconUrl288x72(String iconUrl288x72) {
                this.iconUrl288x72 = iconUrl288x72;
            }

            public String getIconUrl36x36() {
                return iconUrl36x36;
            }

            public void setIconUrl36x36(String iconUrl36x36) {
                this.iconUrl36x36 = iconUrl36x36;
            }

            public String getIconUrl56x56() {
                return iconUrl56x56;
            }

            public void setIconUrl56x56(String iconUrl56x56) {
                this.iconUrl56x56 = iconUrl56x56;
            }

            public String getPinyin() {
                return pinyin;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }

            public String getServiceTel() {
                return serviceTel;
            }

            public void setServiceTel(String serviceTel) {
                this.serviceTel = serviceTel;
            }

            public String getWebUrl() {
                return webUrl;
            }

            public void setWebUrl(String webUrl) {
                this.webUrl = webUrl;
            }
        }

        public static class PackageStatusBean {
            private String departureName;
            private String desc;
            private String destinationName;
            private String newStatusCode;
            private String newStatusDesc;
            private String progressbar;
            private String status;
            private String statusCode;

            public String getDepartureName() {
                return departureName;
            }

            public void setDepartureName(String departureName) {
                this.departureName = departureName;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDestinationName() {
                return destinationName;
            }

            public void setDestinationName(String destinationName) {
                this.destinationName = destinationName;
            }

            public String getNewStatusCode() {
                return newStatusCode;
            }

            public void setNewStatusCode(String newStatusCode) {
                this.newStatusCode = newStatusCode;
            }

            public String getNewStatusDesc() {
                return newStatusDesc;
            }

            public void setNewStatusDesc(String newStatusDesc) {
                this.newStatusDesc = newStatusDesc;
            }

            public String getProgressbar() {
                return progressbar;
            }

            public void setProgressbar(String progressbar) {
                this.progressbar = progressbar;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStatusCode() {
                return statusCode;
            }

            public void setStatusCode(String statusCode) {
                this.statusCode = statusCode;
            }
        }

        public static class TransitListBean {
            private String action;
            private String message;
            private String sectionIcon;
            private String time;
            private String sectionName;

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getSectionIcon() {
                return sectionIcon;
            }

            public void setSectionIcon(String sectionIcon) {
                this.sectionIcon = sectionIcon;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getSectionName() {
                return sectionName;
            }

            public void setSectionName(String sectionName) {
                this.sectionName = sectionName;
            }
        }
    }
}
