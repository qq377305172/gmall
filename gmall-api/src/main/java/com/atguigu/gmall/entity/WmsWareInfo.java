package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (WmsWareInfo)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
public class WmsWareInfo implements Serializable {
    private static final long serialVersionUID = -17231280431417903L;
    
    private Long id;
    
    private String name;
    
    private String address;
    
    private String areacode;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}