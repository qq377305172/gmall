package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.PmsBaseCatalog2;
import java.util.List;

/**
 * (PmsBaseCatalog2)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface PmsBaseCatalog2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsBaseCatalog2 queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsBaseCatalog2> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsBaseCatalog2 实例对象
     * @return 实例对象
     */
    PmsBaseCatalog2 insert(PmsBaseCatalog2 pmsBaseCatalog2);

    /**
     * 修改数据
     *
     * @param pmsBaseCatalog2 实例对象
     * @return 实例对象
     */
    PmsBaseCatalog2 update(PmsBaseCatalog2 pmsBaseCatalog2);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}