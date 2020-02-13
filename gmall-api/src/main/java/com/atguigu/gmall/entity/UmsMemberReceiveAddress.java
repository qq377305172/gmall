package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * ä¼šå‘˜æ”¶è´§åœ°å€è¡¨(UmsMemberReceiveAddress)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
public class UmsMemberReceiveAddress implements Serializable {
    private static final long serialVersionUID = 566543118032317622L;
    
    private Long id;
    
    private Long memberId;
    /**
    * æ”¶è´§äººåç§°
    */
    private String name;
    
    private String phoneNumber;
    /**
    * æ˜¯å¦ä¸ºé»˜è®¤
    */
    private Integer defaultStatus;
    /**
    * é‚®æ”¿ç¼–ç 
    */
    private String postCode;
    /**
    * çœä»½/ç›´è¾–å¸‚
    */
    private String province;
    /**
    * åŸŽå¸‚
    */
    private String city;
    /**
    * åŒº
    */
    private String region;
    /**
    * è¯¦ç»†åœ°å€(è¡—é“)
    */
    private String detailAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

}