package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * å…¬å¸æ”¶å‘è´§åœ°å€è¡¨(OmsCompanyAddress)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class OmsCompanyAddress implements Serializable {
    private static final long serialVersionUID = -59128352826656714L;
    
    private Long id;
    /**
    * åœ°å€åç§°
    */
    private String addressName;
    /**
    * é»˜è®¤å‘è´§åœ°å€ï¼š0->å¦ï¼›1->æ˜¯
    */
    private Integer sendStatus;
    /**
    * æ˜¯å¦é»˜è®¤æ”¶è´§åœ°å€ï¼š0->å¦ï¼›1->æ˜¯
    */
    private Integer receiveStatus;
    /**
    * æ”¶å‘è´§äººå§“å
    */
    private String name;
    /**
    * æ”¶è´§äººç”µè¯
    */
    private String phone;
    /**
    * çœ/ç›´è¾–å¸‚
    */
    private String province;
    /**
    * å¸‚
    */
    private String city;
    /**
    * åŒº
    */
    private String region;
    /**
    * è¯¦ç»†åœ°å€
    */
    private String detailAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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