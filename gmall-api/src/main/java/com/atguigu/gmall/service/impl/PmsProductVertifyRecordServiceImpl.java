package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsProductVertifyRecord;
import com.atguigu.gmall.dao.PmsProductVertifyRecordDao;
import com.atguigu.gmall.service.PmsProductVertifyRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * å•†å“å®¡æ ¸è®°å½•(PmsProductVertifyRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsProductVertifyRecordService")
public class PmsProductVertifyRecordServiceImpl implements PmsProductVertifyRecordService {
    @Resource
    private PmsProductVertifyRecordDao pmsProductVertifyRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductVertifyRecord queryById(Long id) {
        return this.pmsProductVertifyRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductVertifyRecord> queryAllByLimit(int offset, int limit) {
        return this.pmsProductVertifyRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductVertifyRecord 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductVertifyRecord insert(PmsProductVertifyRecord pmsProductVertifyRecord) {
        this.pmsProductVertifyRecordDao.insert(pmsProductVertifyRecord);
        return pmsProductVertifyRecord;
    }

    /**
     * 修改数据
     *
     * @param pmsProductVertifyRecord 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductVertifyRecord update(PmsProductVertifyRecord pmsProductVertifyRecord) {
        this.pmsProductVertifyRecordDao.update(pmsProductVertifyRecord);
        return this.queryById(pmsProductVertifyRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductVertifyRecordDao.deleteById(id) > 0;
    }
}