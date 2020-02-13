package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.PmsBaseCatalog1;
import java.util.List;

/**
 * ä¸€çº§åˆ†ç±»è¡¨(PmsBaseCatalog1)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface PmsBaseCatalog1Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsBaseCatalog1 queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsBaseCatalog1> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsBaseCatalog1 实例对象
     * @return 实例对象
     */
    PmsBaseCatalog1 insert(PmsBaseCatalog1 pmsBaseCatalog1);

    /**
     * 修改数据
     *
     * @param pmsBaseCatalog1 实例对象
     * @return 实例对象
     */
    PmsBaseCatalog1 update(PmsBaseCatalog1 pmsBaseCatalog1);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}