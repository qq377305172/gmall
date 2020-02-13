package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsSkuAttrValue;
import com.atguigu.gmall.dao.PmsSkuAttrValueDao;
import com.atguigu.gmall.service.PmsSkuAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * skuå¹³å°å±žæ€§å€¼å…³è”è¡¨(PmsSkuAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
@Service("pmsSkuAttrValueService")
public class PmsSkuAttrValueServiceImpl implements PmsSkuAttrValueService {
    @Resource
    private PmsSkuAttrValueDao pmsSkuAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuAttrValue queryById(Long id) {
        return this.pmsSkuAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuAttrValue insert(PmsSkuAttrValue pmsSkuAttrValue) {
        this.pmsSkuAttrValueDao.insert(pmsSkuAttrValue);
        return pmsSkuAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuAttrValue update(PmsSkuAttrValue pmsSkuAttrValue) {
        this.pmsSkuAttrValueDao.update(pmsSkuAttrValue);
        return this.queryById(pmsSkuAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuAttrValueDao.deleteById(id) > 0;
    }
}