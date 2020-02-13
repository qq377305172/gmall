package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (PmsBaseSaleAttr)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseSaleAttr implements Serializable {
    private static final long serialVersionUID = 809097374856507006L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * é”€å”®å±žæ€§åç§°
    */
    private String name;


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

}