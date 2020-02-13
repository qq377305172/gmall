package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsSkuSaleAttrValue;
import com.atguigu.gmall.dao.PmsSkuSaleAttrValueDao;
import com.atguigu.gmall.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * skué”€å”®å±žæ€§å€¼(PmsSkuSaleAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService {
    @Resource
    private PmsSkuSaleAttrValueDao pmsSkuSaleAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue queryById(Long id) {
        return this.pmsSkuSaleAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuSaleAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuSaleAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.insert(pmsSkuSaleAttrValue);
        return pmsSkuSaleAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.update(pmsSkuSaleAttrValue);
        return this.queryById(pmsSkuSaleAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuSaleAttrValueDao.deleteById(id) > 0;
    }
}