package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.entity.UmsMemberReceiveAddress;
import java.util.List;

/**
 * ä¼šå‘˜æ”¶è´§åœ°å€è¡¨(UmsMemberReceiveAddress)表服务接口
 *
 * @author makejava
 * @since 2020-02-11 18:44:21
 */
public interface UmsMemberReceiveAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberReceiveAddress queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMemberReceiveAddress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    UmsMemberReceiveAddress insert(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * 修改数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    UmsMemberReceiveAddress update(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}