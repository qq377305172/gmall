package com.atguigu.gmall.dao;

import com.atguigu.gmall.entity.PmsCommentReplay;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * äº§å“è¯„ä»·å›žå¤è¡¨(PmsCommentReplay)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-13 11:01:52
 */
public interface PmsCommentReplayDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsCommentReplay queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsCommentReplay> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsCommentReplay 实例对象
     * @return 对象列表
     */
    List<PmsCommentReplay> queryAll(PmsCommentReplay pmsCommentReplay);

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 影响行数
     */
    int insert(PmsCommentReplay pmsCommentReplay);

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 影响行数
     */
    int update(PmsCommentReplay pmsCommentReplay);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}