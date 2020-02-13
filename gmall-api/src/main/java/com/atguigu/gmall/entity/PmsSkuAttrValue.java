package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * skuå¹³å°å±žæ€§å€¼å…³è”è¡¨(PmsSkuAttrValue)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsSkuAttrValue implements Serializable {
    private static final long serialVersionUID = -90505569997968272L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å±žæ€§idï¼ˆå†—ä½™)
    */
    private Long attrId;
    /**
    * å±žæ€§å€¼id
    */
    private Long valueId;
    /**
    * skuid
    */
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}