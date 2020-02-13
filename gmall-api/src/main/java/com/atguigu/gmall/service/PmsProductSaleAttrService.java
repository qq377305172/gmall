package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.PmsProductSaleAttr;
import java.util.List;

/**
 * (PmsProductSaleAttr)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface PmsProductSaleAttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductSaleAttr queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductSaleAttr> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsProductSaleAttr 实例对象
     * @return 实例对象
     */
    PmsProductSaleAttr insert(PmsProductSaleAttr pmsProductSaleAttr);

    /**
     * 修改数据
     *
     * @param pmsProductSaleAttr 实例对象
     * @return 实例对象
     */
    PmsProductSaleAttr update(PmsProductSaleAttr pmsProductSaleAttr);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}