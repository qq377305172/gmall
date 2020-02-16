package com.atguigu.gmall.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * ä¼šå‘˜ç­‰çº§è¡¨(UmsMemberLevel)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
@Getter
@Setter
@ToString
public class UmsMemberLevel implements Serializable {
    private static final long serialVersionUID = -52793634291891217L;
    
    private Long id;
    
    private String name;
    
    private Integer growthPoint;
    /**
    * æ˜¯å¦ä¸ºé»˜è®¤ç­‰çº§ï¼š0->ä¸æ˜¯ï¼›1->æ˜¯
    */
    private Integer defaultStatus;
    /**
    * å…è¿è´¹æ ‡å‡†
    */
    private Double freeFreightPoint;
    /**
    * æ¯æ¬¡è¯„ä»·èŽ·å–çš„æˆé•¿å€¼
    */
    private Integer commentGrowthPoint;
    /**
    * æ˜¯å¦æœ‰å…é‚®ç‰¹æƒ
    */
    private Integer priviledgeFreeFreight;
    /**
    * æ˜¯å¦æœ‰ç­¾åˆ°ç‰¹æƒ
    */
    private Integer priviledgeSignIn;
    /**
    * æ˜¯å¦æœ‰è¯„è®ºèŽ·å¥–åŠ±ç‰¹æƒ
    */
    private Integer priviledgeComment;
    /**
    * æ˜¯å¦æœ‰ä¸“äº«æ´»åŠ¨ç‰¹æƒ
    */
    private Integer priviledgePromotion;
    /**
    * æ˜¯å¦æœ‰ä¼šå‘˜ä»·æ ¼ç‰¹æƒ
    */
    private Integer priviledgeMemberPrice;
    /**
    * æ˜¯å¦æœ‰ç”Ÿæ—¥ç‰¹æƒ
    */
    private Integer priviledgeBirthday;
    
    private String note;



}