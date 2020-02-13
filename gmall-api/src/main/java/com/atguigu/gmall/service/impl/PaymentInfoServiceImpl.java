package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PaymentInfo;
import com.atguigu.gmall.dao.PaymentInfoDao;
import com.atguigu.gmall.service.PaymentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * æ”¯ä»˜ä¿¡æ¯è¡¨(PaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("paymentInfoService")
public class PaymentInfoServiceImpl implements PaymentInfoService {
    @Resource
    private PaymentInfoDao paymentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PaymentInfo queryById(Long id) {
        return this.paymentInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PaymentInfo> queryAllByLimit(int offset, int limit) {
        return this.paymentInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo insert(PaymentInfo paymentInfo) {
        this.paymentInfoDao.insert(paymentInfo);
        return paymentInfo;
    }

    /**
     * 修改数据
     *
     * @param paymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PaymentInfo update(PaymentInfo paymentInfo) {
        this.paymentInfoDao.update(paymentInfo);
        return this.queryById(paymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.paymentInfoDao.deleteById(id) > 0;
    }
}