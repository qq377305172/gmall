package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.OmsCompanyAddress;
import com.atguigu.gmall.dao.OmsCompanyAddressDao;
import com.atguigu.gmall.service.OmsCompanyAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * å…¬å¸æ”¶å‘è´§åœ°å€è¡¨(OmsCompanyAddress)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("omsCompanyAddressService")
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Resource
    private OmsCompanyAddressDao omsCompanyAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsCompanyAddress queryById(Long id) {
        return this.omsCompanyAddressDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsCompanyAddress> queryAllByLimit(int offset, int limit) {
        return this.omsCompanyAddressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsCompanyAddress 实例对象
     * @return 实例对象
     */
    @Override
    public OmsCompanyAddress insert(OmsCompanyAddress omsCompanyAddress) {
        this.omsCompanyAddressDao.insert(omsCompanyAddress);
        return omsCompanyAddress;
    }

    /**
     * 修改数据
     *
     * @param omsCompanyAddress 实例对象
     * @return 实例对象
     */
    @Override
    public OmsCompanyAddress update(OmsCompanyAddress omsCompanyAddress) {
        this.omsCompanyAddressDao.update(omsCompanyAddress);
        return this.queryById(omsCompanyAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsCompanyAddressDao.deleteById(id) > 0;
    }
}