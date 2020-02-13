package com.atguigu.gmall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * å•†å“å®¡æ ¸è®°å½•(PmsProductVertifyRecord)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsProductVertifyRecord implements Serializable {
    private static final long serialVersionUID = 458106324229454689L;
    
    private Long id;
    
    private Long productId;
    
    private Date createTime;
    /**
    * å®¡æ ¸äºº
    */
    private String vertifyMan;
    
    private Integer status;
    /**
    * åé¦ˆè¯¦æƒ…
    */
    private String detail;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}