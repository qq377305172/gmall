package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsBaseCatalog3;
import com.atguigu.gmall.dao.PmsBaseCatalog3Dao;
import com.atguigu.gmall.service.PmsBaseCatalog3Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PmsBaseCatalog3)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsBaseCatalog3Service")
public class PmsBaseCatalog3ServiceImpl implements PmsBaseCatalog3Service {
    @Resource
    private PmsBaseCatalog3Dao pmsBaseCatalog3Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog3 queryById(Long id) {
        return this.pmsBaseCatalog3Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBaseCatalog3> queryAllByLimit(int offset, int limit) {
        return this.pmsBaseCatalog3Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBaseCatalog3 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog3 insert(PmsBaseCatalog3 pmsBaseCatalog3) {
        this.pmsBaseCatalog3Dao.insert(pmsBaseCatalog3);
        return pmsBaseCatalog3;
    }

    /**
     * 修改数据
     *
     * @param pmsBaseCatalog3 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseCatalog3 update(PmsBaseCatalog3 pmsBaseCatalog3) {
        this.pmsBaseCatalog3Dao.update(pmsBaseCatalog3);
        return this.queryById(pmsBaseCatalog3.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsBaseCatalog3Dao.deleteById(id) > 0;
    }
}