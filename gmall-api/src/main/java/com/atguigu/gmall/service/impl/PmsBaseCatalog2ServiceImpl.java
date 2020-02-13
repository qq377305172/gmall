package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsBaseCatalog2;
import com.atguigu.gmall.dao.PmsBaseCatalog2Dao;
import com.atguigu.gmall.service.PmsBaseCatalog2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PmsBaseCatalog2)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsBaseCatalog2Service")
public class PmsBaseCatalog2ServiceImpl implements PmsBaseCatalog2Service {
    @Resource
    private PmsBaseCatalog2Dao pmsBaseCatalog2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog2 queryById(Integer id) {
        return this.pmsBaseCatalog2Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBaseCatalog2> queryAllByLimit(int offset, int limit) {
        return this.pmsBaseCatalog2Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBaseCatalog2 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog2 insert(PmsBaseCatalog2 pmsBaseCatalog2) {
        this.pmsBaseCatalog2Dao.insert(pmsBaseCatalog2);
        return pmsBaseCatalog2;
    }

    /**
     * 修改数据
     *
     * @param pmsBaseCatalog2 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog2 update(PmsBaseCatalog2 pmsBaseCatalog2) {
        this.pmsBaseCatalog2Dao.update(pmsBaseCatalog2);
        return this.queryById(pmsBaseCatalog2.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pmsBaseCatalog2Dao.deleteById(id) > 0;
    }
}