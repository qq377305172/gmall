package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.OmsCompanyAddress;
import java.util.List;

/**
 * å…¬å¸æ”¶å‘è´§åœ°å€è¡¨(OmsCompanyAddress)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface OmsCompanyAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsCompanyAddress queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsCompanyAddress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsCompanyAddress 实例对象
     * @return 实例对象
     */
    OmsCompanyAddress insert(OmsCompanyAddress omsCompanyAddress);

    /**
     * 修改数据
     *
     * @param omsCompanyAddress 实例对象
     * @return 实例对象
     */
    OmsCompanyAddress update(OmsCompanyAddress omsCompanyAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}