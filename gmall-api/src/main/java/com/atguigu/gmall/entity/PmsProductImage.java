package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * å•†å“å›¾ç‰‡è¡¨(PmsProductImage)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsProductImage implements Serializable {
    private static final long serialVersionUID = 999781708863338315L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å•†å“id
    */
    private Long productId;
    /**
    * å›¾ç‰‡åç§°
    */
    private String imgName;
    /**
    * å›¾ç‰‡è·¯å¾„
    */
    private String imgUrl;


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

}