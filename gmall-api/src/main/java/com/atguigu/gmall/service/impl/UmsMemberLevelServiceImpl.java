package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.dao.UmsMemberLevelDao;
import com.atguigu.gmall.entity.UmsMemberLevel;
import com.atguigu.gmall.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ä¼šå‘˜ç­‰çº§è¡¨(UmsMemberLevel)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Resource
    private UmsMemberLevelDao umsMemberLevelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel queryById(Long id) {
        return this.umsMemberLevelDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMemberLevel> queryAllByLimit(int offset, int limit) {
        return this.umsMemberLevelDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel insert(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelDao.insert(umsMemberLevel);
        return umsMemberLevel;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel update(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelDao.update(umsMemberLevel);
        return this.queryById(umsMemberLevel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLevelDao.deleteById(id) > 0;
    }
}