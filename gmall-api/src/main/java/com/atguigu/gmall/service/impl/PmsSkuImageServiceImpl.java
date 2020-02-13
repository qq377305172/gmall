package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.entity.PmsSkuImage;
import com.atguigu.gmall.dao.PmsSkuImageDao;
import com.atguigu.gmall.service.PmsSkuImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * åº“å­˜å•å…ƒå›¾ç‰‡è¡¨(PmsSkuImage)表服务实现类
 *
 * @author makejava
 * @since 2020-02-13 11:01:53
 */
@Service("pmsSkuImageService")
public class PmsSkuImageServiceImpl implements PmsSkuImageService {
    @Resource
    private PmsSkuImageDao pmsSkuImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuImage queryById(Long id) {
        return this.pmsSkuImageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuImage> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuImage 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImage insert(PmsSkuImage pmsSkuImage) {
        this.pmsSkuImageDao.insert(pmsSkuImage);
        return pmsSkuImage;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuImage 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImage update(PmsSkuImage pmsSkuImage) {
        this.pmsSkuImageDao.update(pmsSkuImage);
        return this.queryById(pmsSkuImage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuImageDao.deleteById(id) > 0;
    }
}