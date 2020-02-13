package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * æ”¯ä»˜ä¿¡æ¯è¡¨(PaymentInfo)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PaymentInfo implements Serializable {
    private static final long serialVersionUID = -43908569274772481L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å¯¹å¤–ä¸šåŠ¡ç¼–å·
    */
    private String orderSn;
    /**
    * è®¢å•ç¼–å·
    */
    private String orderId;
    /**
    * æ”¯ä»˜å®äº¤æ˜“ç¼–å·
    */
    private String alipayTradeNo;
    /**
    * æ”¯ä»˜é‡‘é¢
    */
    private Double totalAmount;
    /**
    * äº¤æ˜“å†…å®¹
    */
    private String subject;
    /**
    * æ”¯ä»˜çŠ¶æ€
    */
    private String paymentStatus;
    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createTime;
    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date confirmTime;
    /**
    * å›žè°ƒä¿¡æ¯
    */
    private String callbackContent;
    
    private Date callbackTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public Date getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

}