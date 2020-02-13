package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (PmsProductInfo)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsProductInfo implements Serializable {
    private static final long serialVersionUID = -69973588159985672L;
    /**
    * å•†å“id
    */
    private Long id;
    /**
    * å•†å“åç§°
    */
    private String productName;
    /**
    * å•†å“æè¿°(åŽå°ç®€è¿°ï¼‰
    */
    private String description;
    /**
    * ä¸‰çº§åˆ†ç±»id
    */
    private Long catalog3Id;
    /**
    * å“ç‰Œid
    */
    private Long tmId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

}