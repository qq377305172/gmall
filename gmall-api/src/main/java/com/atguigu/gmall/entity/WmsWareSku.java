package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * (WmsWareSku)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
public class WmsWareSku implements Serializable {
    private static final long serialVersionUID = 684636400050648384L;
    /**
    * ç¼–å·
    */
    private Long id;
    /**
    * skuid
    */
    private Long skuId;
    /**
    * ä»“åº“id
    */
    private Long warehouseId;
    /**
    * åº“å­˜æ•°
    */
    private Integer stock;
    /**
    * å­˜è´§åç§°
    */
    private String stockName;
    
    private Integer stockLocked;


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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

}