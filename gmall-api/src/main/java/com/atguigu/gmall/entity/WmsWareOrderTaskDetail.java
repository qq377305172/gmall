package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (WmsWareOrderTaskDetail)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
public class WmsWareOrderTaskDetail implements Serializable {
    private static final long serialVersionUID = 646213654686844097L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * sku_id
    */
    private Long skuId;
    /**
    * skuåç§°
    */
    private String skuName;
    /**
    * è´­ä¹°ä¸ªæ•°
    */
    private Integer skuNums;
    /**
    * å·¥ä½œå•ç¼–å·
    */
    private Long taskId;
    
    private Integer skuNum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuNums() {
        return skuNums;
    }

    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

}