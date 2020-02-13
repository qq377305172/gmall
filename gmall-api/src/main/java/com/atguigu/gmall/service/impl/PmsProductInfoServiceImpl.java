package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsProductInfo;
import com.atguigu.gmall.dao.PmsProductInfoDao;
import com.atguigu.gmall.service.PmsProductInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PmsProductInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsProductInfoService")
public class PmsProductInfoServiceImpl implements PmsProductInfoService {
    @Resource
    private PmsProductInfoDao pmsProductInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductInfo queryById(Long id) {
        return this.pmsProductInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductInfo> queryAllByLimit(int offset, int limit) {
        return this.pmsProductInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductInfo insert(PmsProductInfo pmsProductInfo) {
        this.pmsProductInfoDao.insert(pmsProductInfo);
        return pmsProductInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsProductInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductInfo update(PmsProductInfo pmsProductInfo) {
        this.pmsProductInfoDao.update(pmsProductInfo);
        return this.queryById(pmsProductInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductInfoDao.deleteById(id) > 0;
    }
}