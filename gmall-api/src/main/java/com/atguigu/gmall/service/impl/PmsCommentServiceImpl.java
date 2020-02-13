package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsComment;
import com.atguigu.gmall.dao.PmsCommentDao;
import com.atguigu.gmall.service.PmsCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * å•†å“è¯„ä»·è¡¨(PmsComment)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsCommentService")
public class PmsCommentServiceImpl implements PmsCommentService {
    @Resource
    private PmsCommentDao pmsCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsComment queryById(Long id) {
        return this.pmsCommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsComment> queryAllByLimit(int offset, int limit) {
        return this.pmsCommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsComment insert(PmsComment pmsComment) {
        this.pmsCommentDao.insert(pmsComment);
        return pmsComment;
    }

    /**
     * 修改数据
     *
     * @param pmsComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsComment update(PmsComment pmsComment) {
        this.pmsCommentDao.update(pmsComment);
        return this.queryById(pmsComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsCommentDao.deleteById(id) > 0;
    }
}