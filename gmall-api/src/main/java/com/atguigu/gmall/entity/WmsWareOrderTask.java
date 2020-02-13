package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * åº“å­˜å·¥ä½œå•è¡¨ åº“å­˜å·¥ä½œå•è¡¨(WmsWareOrderTask)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
public class WmsWareOrderTask implements Serializable {
    private static final long serialVersionUID = -97692983126053200L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * è®¢å•ç¼–å·
    */
    private Long orderId;
    /**
    * æ”¶è´§äºº
    */
    private String consignee;
    /**
    * æ”¶è´§äººç”µè¯
    */
    private String consigneeTel;
    /**
    * é€è´§åœ°å€
    */
    private String deliveryAddress;
    /**
    * è®¢å•å¤‡æ³¨
    */
    private String orderComment;
    /**
    * ä»˜æ¬¾æ–¹å¼ 1:åœ¨çº¿ä»˜æ¬¾ 2:è´§åˆ°ä»˜æ¬¾
    */
    private String paymentWay;
    
    private String taskStatus;
    /**
    * è®¢å•æè¿°
    */
    private String orderBody;
    /**
    * ç‰©æµå•å·
    */
    private String trackingNo;
    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createTime;
    /**
    * ä»“åº“ç¼–å·
    */
    private Long wareId;
    /**
    * å·¥ä½œå•å¤‡æ³¨
    */
    private String taskComment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

}