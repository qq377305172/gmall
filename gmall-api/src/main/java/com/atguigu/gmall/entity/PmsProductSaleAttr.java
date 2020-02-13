package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (PmsProductSaleAttr)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsProductSaleAttr implements Serializable {
    private static final long serialVersionUID = 841202602861797784L;
    /**
    * id
    */
    private Long id;
    /**
    * å•†å“id
    */
    private Long productId;
    /**
    * é”€å”®å±žæ€§id
    */
    private Long saleAttrId;
    /**
    * é”€å”®å±žæ€§åç§°(å†—ä½™)
    */
    private String saleAttrName;


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

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

}