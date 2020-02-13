package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsBaseAttrValue;
import com.atguigu.gmall.dao.PmsBaseAttrValueDao;
import com.atguigu.gmall.service.PmsBaseAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * å±žæ€§å€¼è¡¨(PmsBaseAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsBaseAttrValueService")
public class PmsBaseAttrValueServiceImpl implements PmsBaseAttrValueService {
    @Resource
    private PmsBaseAttrValueDao pmsBaseAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsBaseAttrValue queryById(Long id) {
        return this.pmsBaseAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsBaseAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsBaseAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsBaseAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseAttrValue insert(PmsBaseAttrValue pmsBaseAttrValue) {
        this.pmsBaseAttrValueDao.insert(pmsBaseAttrValue);
        return pmsBaseAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsBaseAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsBaseAttrValue update(PmsBaseAttrValue pmsBaseAttrValue) {
        this.pmsBaseAttrValueDao.update(pmsBaseAttrValue);
        return this.queryById(pmsBaseAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsBaseAttrValueDao.deleteById(id) > 0;
    }
}