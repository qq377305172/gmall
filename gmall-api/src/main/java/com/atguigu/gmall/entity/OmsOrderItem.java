package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * è®¢å•ä¸­æ‰€åŒ…å«çš„å•†å“(OmsOrderItem)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class OmsOrderItem implements Serializable {
    private static final long serialVersionUID = -39313620051438035L;
    
    private Long id;
    /**
    * è®¢å•id
    */
    private Long orderId;
    /**
    * è®¢å•ç¼–å·
    */
    private String orderSn;
    
    private Long productId;
    
    private String productPic;
    
    private String productName;
    
    private String productBrand;
    
    private String productSn;
    /**
    * é”€å”®ä»·æ ¼
    */
    private Double productPrice;
    /**
    * è´­ä¹°æ•°é‡
    */
    private Integer productQuantity;
    /**
    * å•†å“skuç¼–å·
    */
    private Long productSkuId;
    /**
    * å•†å“skuæ¡ç 
    */
    private String productSkuCode;
    /**
    * å•†å“åˆ†ç±»id
    */
    private Long productCategoryId;
    /**
    * å•†å“çš„é”€å”®å±žæ€§
    */
    private String sp1;
    
    private String sp2;
    
    private String sp3;
    /**
    * å•†å“ä¿ƒé”€åç§°
    */
    private String promotionName;
    /**
    * å•†å“ä¿ƒé”€åˆ†è§£é‡‘é¢
    */
    private Double promotionAmount;
    /**
    * ä¼˜æƒ åˆ¸ä¼˜æƒ åˆ†è§£é‡‘é¢
    */
    private Double couponAmount;
    /**
    * ç§¯åˆ†ä¼˜æƒ åˆ†è§£é‡‘é¢
    */
    private Double integrationAmount;
    /**
    * è¯¥å•†å“ç»è¿‡ä¼˜æƒ åŽçš„åˆ†è§£é‡‘é¢
    */
    private Double realAmount;
    
    private Integer giftIntegration;
    
    private Integer giftGrowth;
    /**
    * å•†å“é”€å”®å±žæ€§:[{"key":"é¢œè‰²","value":"é¢œè‰²"},{"key":"å®¹é‡","value":"4G"}]
    */
    private String productAttr;


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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Double getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(Double integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public Double getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Double realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

}