package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.WmsWareInfo;
import com.atguigu.gmall.dao.WmsWareInfoDao;
import com.atguigu.gmall.service.WmsWareInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WmsWareInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl implements WmsWareInfoService {
    @Resource
    private WmsWareInfoDao wmsWareInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareInfo queryById(Long id) {
        return this.wmsWareInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WmsWareInfo> queryAllByLimit(int offset, int limit) {
        return this.wmsWareInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo insert(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoDao.insert(wmsWareInfo);
        return wmsWareInfo;
    }

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo update(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoDao.update(wmsWareInfo);
        return this.queryById(wmsWareInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareInfoDao.deleteById(id) > 0;
    }
}