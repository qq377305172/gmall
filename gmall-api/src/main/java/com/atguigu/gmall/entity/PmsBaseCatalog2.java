package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (PmsBaseCatalog2)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseCatalog2 implements Serializable {
    private static final long serialVersionUID = -13418400513383680L;
    /**
    * ç¼–å·
    */
    private Integer id;
    /**
    * äºŒçº§åˆ†ç±»åç§°
    */
    private String name;
    /**
    * ä¸€çº§åˆ†ç±»ç¼–å·
    */
    private Integer catalog1Id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

}