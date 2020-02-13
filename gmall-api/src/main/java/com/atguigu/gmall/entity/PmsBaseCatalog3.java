package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (PmsBaseCatalog3)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseCatalog3 implements Serializable {
    private static final long serialVersionUID = -72114031130441679L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * ä¸‰çº§åˆ†ç±»åç§°
    */
    private String name;
    /**
    * äºŒçº§åˆ†ç±»ç¼–å·
    */
    private Long catalog2Id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

}