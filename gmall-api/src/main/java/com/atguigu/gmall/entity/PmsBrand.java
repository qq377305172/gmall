package com.atguigu.gmall.entity;

import java.io.Serializable;

/**
 * å“ç‰Œè¡¨(PmsBrand)实体类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 394903678522510120L;
    
    private Long id;
    
    private String name;
    /**
    * é¦–å­—æ¯
    */
    private String firstLetter;
    
    private Integer sort;
    /**
    * æ˜¯å¦ä¸ºå“ç‰Œåˆ¶é€ å•†ï¼š0->ä¸æ˜¯ï¼›1->æ˜¯
    */
    private Integer factoryStatus;
    
    private Integer showStatus;
    /**
    * äº§å“æ•°é‡
    */
    private Integer productCount;
    /**
    * äº§å“è¯„è®ºæ•°é‡
    */
    private Integer productCommentCount;
    /**
    * å“ç‰Œlogo
    */
    private String logo;
    /**
    * ä¸“åŒºå¤§å›¾
    */
    private String bigPic;
    /**
    * å“ç‰Œæ•…äº‹
    */
    private String brandStory;


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

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

}