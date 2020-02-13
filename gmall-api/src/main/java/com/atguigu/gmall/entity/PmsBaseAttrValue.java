package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * å±žæ€§å€¼è¡¨(PmsBaseAttrValue)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBaseAttrValue implements Serializable {
    private static final long serialVersionUID = 207676164332151547L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * å±žæ€§å€¼åç§°
    */
    private String valueName;
    /**
    * å±žæ€§id
    */
    private Long attrId;
    /**
    * å¯ç”¨ï¼š1 åœç”¨ï¼š0 1
    */
    private String isEnabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

}