package com.atguigu.gmall.dao;

import com.atguigu.gmall.entity.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * å•†å“å®¡æ ¸è®°å½•(PmsProductVertifyRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface PmsProductVertifyRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductVertifyRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsProductVertifyRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsProductVertifyRecord 实例对象
     * @return 对象列表
     */
    List<PmsProductVertifyRecord> queryAll(PmsProductVertifyRecord pmsProductVertifyRecord);

    /**
     * 新增数据
     *
     * @param pmsProductVertifyRecord 实例对象
     * @return 影响行数
     */
    int insert(PmsProductVertifyRecord pmsProductVertifyRecord);

    /**
     * 修改数据
     *
     * @param pmsProductVertifyRecord 实例对象
     * @return 影响行数
     */
    int update(PmsProductVertifyRecord pmsProductVertifyRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}