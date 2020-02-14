package com.atguigu.gmall.user.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * ä¼šå‘˜è¡¨(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-02-13 17:02:28
 */
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 344472854583986811L;
    
    private Long id;
    
    private Long memberLevelId;
    /**
    * ç”¨æˆ·å
    */
    private String username;
    /**
    * å¯†ç 
    */
    private String password;
    /**
    * æ˜µç§°
    */
    private String nickname;
    /**
    * æ‰‹æœºå·ç 
    */
    private String phone;
    /**
    * å¸å·å¯ç”¨çŠ¶æ€:0->ç¦ç”¨ï¼›1->å¯ç”¨
    */
    private Integer status;
    /**
    * æ³¨å†Œæ—¶é—´
    */
    private Date createTime;
    /**
    * å¤´åƒ
    */
    private String icon;
    /**
    * æ€§åˆ«ï¼š0->æœªçŸ¥ï¼›1->ç”·ï¼›2->å¥³
    */
    private Integer gender;
    /**
    * ç”Ÿæ—¥
    */
    private Object birthday;
    /**
    * æ‰€åšåŸŽå¸‚
    */
    private String city;
    /**
    * èŒä¸š
    */
    private String job;
    /**
    * ä¸ªæ€§ç­¾å
    */
    private String personalizedSignature;
    /**
    * ç”¨æˆ·æ¥æº
    */
    private Integer sourceType;
    /**
    * ç§¯åˆ†
    */
    private Integer integration;
    /**
    * æˆé•¿å€¼
    */
    private Integer growth;
    /**
    * å‰©ä½™æŠ½å¥–æ¬¡æ•°
    */
    private Integer luckeyCount;
    /**
    * åŽ†å²ç§¯åˆ†æ•°é‡
    */
    private Integer historyIntegration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

}