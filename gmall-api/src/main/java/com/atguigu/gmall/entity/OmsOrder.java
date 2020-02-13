package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * è®¢å•è¡¨(OmsOrder)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class OmsOrder implements Serializable {
    private static final long serialVersionUID = 216181181095460624L;
    /**
    * è®¢å•id
    */
    private Long id;
    
    private Long memberId;
    
    private Long couponId;
    /**
    * è®¢å•ç¼–å·
    */
    private String orderSn;
    /**
    * æäº¤æ—¶é—´
    */
    private Date createTime;
    /**
    * ç”¨æˆ·å¸å·
    */
    private String memberUsername;
    /**
    * è®¢å•æ€»é‡‘é¢
    */
    private Double totalAmount;
    /**
    * åº”ä»˜é‡‘é¢ï¼ˆå®žé™…æ”¯ä»˜é‡‘é¢ï¼‰
    */
    private Double payAmount;
    /**
    * è¿è´¹é‡‘é¢
    */
    private Double freightAmount;
    /**
    * ä¿ƒé”€ä¼˜åŒ–é‡‘é¢ï¼ˆä¿ƒé”€ä»·ã€æ»¡å‡ã€é˜¶æ¢¯ä»·ï¼‰
    */
    private Double promotionAmount;
    /**
    * ç§¯åˆ†æŠµæ‰£é‡‘é¢
    */
    private Double integrationAmount;
    /**
    * ä¼˜æƒ åˆ¸æŠµæ‰£é‡‘é¢
    */
    private Double couponAmount;
    /**
    * ç®¡ç†å‘˜åŽå°è°ƒæ•´è®¢å•ä½¿ç”¨çš„æŠ˜æ‰£é‡‘é¢
    */
    private Double discountAmount;
    /**
    * æ”¯ä»˜æ–¹å¼ï¼š0->æœªæ”¯ä»˜ï¼›1->æ”¯ä»˜å®ï¼›2->å¾®ä¿¡
    */
    private Integer payType;
    /**
    * è®¢å•æ¥æºï¼š0->PCè®¢å•ï¼›1->appè®¢å•
    */
    private Integer sourceType;
    /**
    * è®¢å•çŠ¶æ€ï¼š0->å¾…ä»˜æ¬¾ï¼›1->å¾…å‘è´§ï¼›2->å·²å‘è´§ï¼›3->å·²å®Œæˆï¼›4->å·²å…³é—­ï¼›5->æ— æ•ˆè®¢å•
    */
    private Integer status;
    /**
    * è®¢å•ç±»åž‹ï¼š0->æ­£å¸¸è®¢å•ï¼›1->ç§’æ€è®¢å•
    */
    private Integer orderType;
    /**
    * ç‰©æµå…¬å¸(é…é€æ–¹å¼)
    */
    private String deliveryCompany;
    /**
    * ç‰©æµå•å·
    */
    private String deliverySn;
    /**
    * è‡ªåŠ¨ç¡®è®¤æ—¶é—´ï¼ˆå¤©ï¼‰
    */
    private Integer autoConfirmDay;
    /**
    * å¯ä»¥èŽ·å¾—çš„ç§¯åˆ†
    */
    private Integer integration;
    /**
    * å¯ä»¥æ´»åŠ¨çš„æˆé•¿å€¼
    */
    private Integer growth;
    /**
    * æ´»åŠ¨ä¿¡æ¯
    */
    private String promotionInfo;
    /**
    * å‘ç¥¨ç±»åž‹ï¼š0->ä¸å¼€å‘ç¥¨ï¼›1->ç”µå­å‘ç¥¨ï¼›2->çº¸è´¨å‘ç¥¨
    */
    private Integer billType;
    /**
    * å‘ç¥¨æŠ¬å¤´
    */
    private String billHeader;
    /**
    * å‘ç¥¨å†…å®¹
    */
    private String billContent;
    /**
    * æ”¶ç¥¨äººç”µè¯
    */
    private String billReceiverPhone;
    /**
    * æ”¶ç¥¨äººé‚®ç®±
    */
    private String billReceiverEmail;
    /**
    * æ”¶è´§äººå§“å
    */
    private String receiverName;
    /**
    * æ”¶è´§äººç”µè¯
    */
    private String receiverPhone;
    /**
    * æ”¶è´§äººé‚®ç¼–
    */
    private String receiverPostCode;
    /**
    * çœä»½/ç›´è¾–å¸‚
    */
    private String receiverProvince;
    /**
    * åŸŽå¸‚
    */
    private String receiverCity;
    /**
    * åŒº
    */
    private String receiverRegion;
    /**
    * è¯¦ç»†åœ°å€
    */
    private String receiverDetailAddress;
    /**
    * è®¢å•å¤‡æ³¨
    */
    private String note;
    /**
    * ç¡®è®¤æ”¶è´§çŠ¶æ€ï¼š0->æœªç¡®è®¤ï¼›1->å·²ç¡®è®¤
    */
    private Integer confirmStatus;
    /**
    * åˆ é™¤çŠ¶æ€ï¼š0->æœªåˆ é™¤ï¼›1->å·²åˆ é™¤
    */
    private Integer deleteStatus;
    /**
    * ä¸‹å•æ—¶ä½¿ç”¨çš„ç§¯åˆ†
    */
    private Integer useIntegration;
    /**
    * æ”¯ä»˜æ—¶é—´
    */
    private Date paymentTime;
    /**
    * å‘è´§æ—¶é—´
    */
    private Date deliveryTime;
    /**
    * ç¡®è®¤æ”¶è´§æ—¶é—´
    */
    private Date receiveTime;
    /**
    * è¯„ä»·æ—¶é—´
    */
    private Date commentTime;
    /**
    * ä¿®æ”¹æ—¶é—´
    */
    private Date modifyTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(Double integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}