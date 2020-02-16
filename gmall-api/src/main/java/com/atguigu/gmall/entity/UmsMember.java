package com.atguigu.gmall.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * ä¼šå‘˜è¡¨(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
@Getter
@Setter
@ToString
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 451738305890769027L;
    
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



}