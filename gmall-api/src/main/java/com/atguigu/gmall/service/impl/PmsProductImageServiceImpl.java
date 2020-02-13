package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsProductImage;
import com.atguigu.gmall.dao.PmsProductImageDao;
import com.atguigu.gmall.service.PmsProductImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * å•†å“å›¾ç‰‡è¡¨(PmsProductImage)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
@Service("pmsProductImageService")
public class PmsProductImageServiceImpl implements PmsProductImageService {
    @Resource
    private PmsProductImageDao pmsProductImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductImage queryById(Long id) {
        return this.pmsProductImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductImage> queryAllByLimit(int offset, int limit) {
        return this.pmsProductImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductImage 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductImage insert(PmsProductImage pmsProductImage) {
        this.pmsProductImageDao.insert(pmsProductImage);
        return pmsProductImage;
    }

    /**
     * 修改数据
     *
     * @param pmsProductImage 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductImage update(PmsProductImage pmsProductImage) {
        this.pmsProductImageDao.update(pmsProductImage);
        return this.queryById(pmsProductImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductImageDao.deleteById(id) > 0;
    }
}