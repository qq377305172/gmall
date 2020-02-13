package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsBaseCatalog1;
import com.atguigu.gmall.dao.PmsBaseCatalog1Dao;
import com.atguigu.gmall.service.PmsBaseCatalog1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ä¸€çº§åˆ†ç±»è¡¨(PmsBaseCatalog1)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsBaseCatalog1Service")
public class PmsBaseCatalog1ServiceImpl implements PmsBaseCatalog1Service {
    @Resource
    private PmsBaseCatalog1Dao pmsBaseCatalog1Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog1 queryById(Integer id) {
        return this.pmsBaseCatalog1Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBaseCatalog1> queryAllByLimit(int offset, int limit) {
        return this.pmsBaseCatalog1Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBaseCatalog1 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog1 insert(PmsBaseCatalog1 pmsBaseCatalog1) {
        this.pmsBaseCatalog1Dao.insert(pmsBaseCatalog1);
        return pmsBaseCatalog1;
    }

    /**
     * 修改数据
     *
     * @param pmsBaseCatalog1 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog1 update(PmsBaseCatalog1 pmsBaseCatalog1) {
        this.pmsBaseCatalog1Dao.update(pmsBaseCatalog1);
        return this.queryById(pmsBaseCatalog1.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pmsBaseCatalog1Dao.deleteById(id) > 0;
    }
}