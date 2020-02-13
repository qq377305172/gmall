package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsBaseSaleAttr;
import com.atguigu.gmall.dao.PmsBaseSaleAttrDao;
import com.atguigu.gmall.service.PmsBaseSaleAttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PmsBaseSaleAttr)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsBaseSaleAttrService")
public class PmsBaseSaleAttrServiceImpl implements PmsBaseSaleAttrService {
    @Resource
    private PmsBaseSaleAttrDao pmsBaseSaleAttrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBaseSaleAttr queryById(Long id) {
        return this.pmsBaseSaleAttrDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBaseSaleAttr> queryAllByLimit(int offset, int limit) {
        return this.pmsBaseSaleAttrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBaseSaleAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseSaleAttr insert(PmsBaseSaleAttr pmsBaseSaleAttr) {
        this.pmsBaseSaleAttrDao.insert(pmsBaseSaleAttr);
        return pmsBaseSaleAttr;
    }

    /**
     * 修改数据
     *
     * @param pmsBaseSaleAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseSaleAttr update(PmsBaseSaleAttr pmsBaseSaleAttr) {
        this.pmsBaseSaleAttrDao.update(pmsBaseSaleAttr);
        return this.queryById(pmsBaseSaleAttr.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsBaseSaleAttrDao.deleteById(id) > 0;
    }
}