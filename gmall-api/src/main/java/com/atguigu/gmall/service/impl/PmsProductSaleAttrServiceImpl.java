package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsProductSaleAttr;
import com.atguigu.gmall.dao.PmsProductSaleAttrDao;
import com.atguigu.gmall.service.PmsProductSaleAttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PmsProductSaleAttr)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsProductSaleAttrService")
public class PmsProductSaleAttrServiceImpl implements PmsProductSaleAttrService {
    @Resource
    private PmsProductSaleAttrDao pmsProductSaleAttrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttr queryById(Long id) {
        return this.pmsProductSaleAttrDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductSaleAttr> queryAllByLimit(int offset, int limit) {
        return this.pmsProductSaleAttrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductSaleAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttr insert(PmsProductSaleAttr pmsProductSaleAttr) {
        this.pmsProductSaleAttrDao.insert(pmsProductSaleAttr);
        return pmsProductSaleAttr;
    }

    /**
     * 修改数据
     *
     * @param pmsProductSaleAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttr update(PmsProductSaleAttr pmsProductSaleAttr) {
        this.pmsProductSaleAttrDao.update(pmsProductSaleAttr);
        return this.queryById(pmsProductSaleAttr.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductSaleAttrDao.deleteById(id) > 0;
    }
}