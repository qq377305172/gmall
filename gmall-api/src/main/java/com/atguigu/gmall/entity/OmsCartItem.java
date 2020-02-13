package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * è´­ç‰©è½¦è¡¨(OmsCartItem)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:49
 */
public class OmsCartItem implements Serializable {
    private static final long serialVersionUID = -44692817444049699L;
    
    private Long id;
    
    private Long productId;
    
    private Long productSkuId;
    
    private Long memberId;
    /**
    * è´­ä¹°æ•°é‡
    */
    private Integer quantity;
    /**
    * æ·»åŠ åˆ°è´­ç‰©è½¦çš„ä»·æ ¼
    */
    private Double price;
    /**
    * é”€å”®å±žæ€§1
    */
    private String sp1;
    /**
    * é”€å”®å±žæ€§2
    */
    private String sp2;
    /**
    * é”€å”®å±žæ€§3
    */
    private String sp3;
    /**
    * å•†å“ä¸»å›¾
    */
    private String productPic;
    /**
    * å•†å“åç§°
    */
    private String productName;
    /**
    * å•†å“å‰¯æ ‡é¢˜ï¼ˆå–ç‚¹ï¼‰
    */
    private String productSubTitle;
    /**
    * å•†å“skuæ¡ç 
    */
    private String productSkuCode;
    /**
    * ä¼šå‘˜æ˜µç§°
    */
    private String memberNickname;
    /**
    * åˆ›å»ºæ—¶é—´
    */
    private Date createDate;
    /**
    * ä¿®æ”¹æ—¶é—´
    */
    private Date modifyDate;
    /**
    * æ˜¯å¦åˆ é™¤
    */
    private Integer deleteStatus;
    /**
    * å•†å“åˆ†ç±»
    */
    private Long productCategoryId;
    
    private String productBrand;
    
    private String productSn;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
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

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

}