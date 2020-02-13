package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * ä¸€çº§åˆ†ç±»è¡¨(PmsBaseCatalog1)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseCatalog1 implements Serializable {
    private static final long serialVersionUID = -56323949325391404L;
    /**
    * ç¼–å·
    */
    private Integer id;
    /**
    * åˆ†ç±»åç§°
    */
    private String name;


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

}