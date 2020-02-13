package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * åº“å­˜å•å…ƒè¡¨(PmsSkuInfo)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
public class PmsSkuInfo implements Serializable {
    private static final long serialVersionUID = 792751573259420743L;
    /**
    * åº“å­˜id(itemID)
    */
    private Long id;
    /**
    * å•†å“id
    */
    private Long productId;
    /**
    * ä»·æ ¼
    */
    private Object price;
    /**
    * skuåç§°
    */
    private String skuName;
    /**
    * å•†å“è§„æ ¼æè¿°
    */
    private String skuDesc;
    
    private Object weight;
    /**
    * å“ç‰Œ(å†—ä½™)
    */
    private Long tmId;
    /**
    * ä¸‰çº§åˆ†ç±»idï¼ˆå†—ä½™)
    */
    private Long catalog3Id;
    /**
    * é»˜è®¤æ˜¾ç¤ºå›¾ç‰‡(å†—ä½™)
    */
    private String skuDefaultImg;


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

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

}