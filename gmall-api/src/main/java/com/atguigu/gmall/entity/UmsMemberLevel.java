package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * ä¼šå‘˜ç­‰çº§è¡¨(UmsMemberLevel)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
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

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public Double getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(Double freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}