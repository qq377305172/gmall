package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsProductSaleAttrValue;
import com.atguigu.gmall.dao.PmsProductSaleAttrValueDao;
import com.atguigu.gmall.service.PmsProductSaleAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spué”€å”®å±žæ€§å€¼(PmsProductSaleAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsProductSaleAttrValueService")
public class PmsProductSaleAttrValueServiceImpl implements PmsProductSaleAttrValueService {
    @Resource
    private PmsProductSaleAttrValueDao pmsProductSaleAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttrValue queryById(Long id) {
        return this.pmsProductSaleAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductSaleAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsProductSaleAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttrValue insert(PmsProductSaleAttrValue pmsProductSaleAttrValue) {
        this.pmsProductSaleAttrValueDao.insert(pmsProductSaleAttrValue);
        return pmsProductSaleAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsProductSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductSaleAttrValue update(PmsProductSaleAttrValue pmsProductSaleAttrValue) {
        this.pmsProductSaleAttrValueDao.update(pmsProductSaleAttrValue);
        return this.queryById(pmsProductSaleAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductSaleAttrValueDao.deleteById(id) > 0;
    }
}