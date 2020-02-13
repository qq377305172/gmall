package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * äº§å“è¯„ä»·å›žå¤è¡¨(PmsCommentReplay)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsCommentReplay implements Serializable {
    private static final long serialVersionUID = 483752031634384274L;
    
    private Long id;
    
    private Long commentId;
    
    private String memberNickName;
    
    private String memberIcon;
    
    private String content;
    
    private Date createTime;
    /**
    * è¯„è®ºäººå‘˜ç±»åž‹ï¼›0->ä¼šå‘˜ï¼›1->ç®¡ç†å‘˜
    */
    private Integer type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}