package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.OmsCartItem;
import java.util.List;

/**
 * è´­ç‰©è½¦è¡¨(OmsCartItem)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:51
 */
public interface OmsCartItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsCartItem queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsCartItem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsCartItem 实例对象
     * @return 实例对象
     */
    OmsCartItem insert(OmsCartItem omsCartItem);

    /**
     * 修改数据
     *
     * @param omsCartItem 实例对象
     * @return 实例对象
     */
    OmsCartItem update(OmsCartItem omsCartItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}