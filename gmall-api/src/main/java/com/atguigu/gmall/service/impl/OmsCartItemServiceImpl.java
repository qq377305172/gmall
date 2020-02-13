package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.OmsCartItem;
import com.atguigu.gmall.dao.OmsCartItemDao;
import com.atguigu.gmall.service.OmsCartItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * è´­ç‰©è½¦è¡¨(OmsCartItem)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:51
 */
@Service("omsCartItemService")
public class OmsCartItemServiceImpl implements OmsCartItemService {
    @Resource
    private OmsCartItemDao omsCartItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsCartItem queryById(Long id) {
        return this.omsCartItemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsCartItem> queryAllByLimit(int offset, int limit) {
        return this.omsCartItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsCartItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsCartItem insert(OmsCartItem omsCartItem) {
        this.omsCartItemDao.insert(omsCartItem);
        return omsCartItem;
    }

    /**
     * 修改数据
     *
     * @param omsCartItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsCartItem update(OmsCartItem omsCartItem) {
        this.omsCartItemDao.update(omsCartItem);
        return this.queryById(omsCartItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsCartItemDao.deleteById(id) > 0;
    }
}