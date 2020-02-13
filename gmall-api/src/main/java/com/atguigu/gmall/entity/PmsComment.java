package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * å•†å“è¯„ä»·è¡¨(PmsComment)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsComment implements Serializable {
    private static final long serialVersionUID = -71284706810933881L;
    
    private Long id;
    
    private Long productId;
    
    private String memberNickName;
    
    private String productName;
    /**
    * è¯„ä»·æ˜Ÿæ•°ï¼š0->5
    */
    private Integer star;
    /**
    * è¯„ä»·çš„ip
    */
    private String memberIp;
    
    private Date createTime;
    
    private Integer showStatus;
    /**
    * è´­ä¹°æ—¶çš„å•†å“å±žæ€§
    */
    private String productAttribute;
    
    private Integer collectCouont;
    
    private Integer readCount;
    
    private String content;
    /**
    * ä¸Šä¼ å›¾ç‰‡åœ°å€ï¼Œä»¥é€—å·éš”å¼€
    */
    private String pics;
    /**
    * è¯„è®ºç”¨æˆ·å¤´åƒ
    */
    private String memberIcon;
    
    private Integer replayCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

}