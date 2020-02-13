package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * å±žæ€§è¡¨(PmsBaseAttrInfo)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseAttrInfo implements Serializable {
    private static final long serialVersionUID = -86947235692336166L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å±žæ€§åç§°
    */
    private String attrName;
    
    private Long catalog3Id;
    /**
    * å¯ç”¨ï¼š1 åœç”¨ï¼š0
    */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

}