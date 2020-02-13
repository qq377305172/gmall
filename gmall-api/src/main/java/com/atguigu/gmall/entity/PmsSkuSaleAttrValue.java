package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * skué”€å”®å±žæ€§å€¼(PmsSkuSaleAttrValue)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
public class PmsSkuSaleAttrValue implements Serializable {
    private static final long serialVersionUID = -68174011248947795L;
    /**
    * id
    */
    private Long id;
    /**
    * åº“å­˜å•å…ƒid
    */
    private Long skuId;
    /**
    * é”€å”®å±žæ€§idï¼ˆå†—ä½™)
    */
    private Long saleAttrId;
    /**
    * é”€å”®å±žæ€§å€¼id
    */
    private Long saleAttrValueId;
    /**
    * é”€å”®å±žæ€§åç§°(å†—ä½™)
    */
    private String saleAttrName;
    /**
    * é”€å”®å±žæ€§å€¼åç§°(å†—ä½™)
    */
    private String saleAttrValueName;


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

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public Long getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(Long saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

}