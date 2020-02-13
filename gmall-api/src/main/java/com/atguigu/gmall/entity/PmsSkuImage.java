package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * åº“å­˜å•å…ƒå›¾ç‰‡è¡¨(PmsSkuImage)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
public class PmsSkuImage implements Serializable {
    private static final long serialVersionUID = 269047326227320724L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å•†å“id
    */
    private Long skuId;
    /**
    * å›¾ç‰‡åç§°ï¼ˆå†—ä½™ï¼‰
    */
    private String imgName;
    /**
    * å›¾ç‰‡è·¯å¾„(å†—ä½™)
    */
    private String imgUrl;
    /**
    * å•†å“å›¾ç‰‡id
    */
    private Long productImgId;
    /**
    * æ˜¯å¦é»˜è®¤
    */
    private String isDefault;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

}