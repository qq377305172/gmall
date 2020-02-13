package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsSkuInfo;
import com.atguigu.gmall.dao.PmsSkuInfoDao;
import com.atguigu.gmall.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * åº“å­˜å•å…ƒè¡¨(PmsSkuInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService {
    @Resource
    private PmsSkuInfoDao pmsSkuInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo queryById(Long id) {
        return this.pmsSkuInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuInfo> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.insert(pmsSkuInfo);
        return pmsSkuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo update(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.update(pmsSkuInfo);
        return this.queryById(pmsSkuInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuInfoDao.deleteById(id) > 0;
    }
}