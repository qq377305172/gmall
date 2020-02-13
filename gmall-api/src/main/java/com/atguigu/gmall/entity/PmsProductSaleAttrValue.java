package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * spué”€å”®å±žæ€§å€¼(PmsProductSaleAttrValue)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsProductSaleAttrValue implements Serializable {
    private static final long serialVersionUID = 188445486845494255L;
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
    * é”€å”®å±žæ€§å€¼åç§°
    */
    private String saleAttrValueName;


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

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

}