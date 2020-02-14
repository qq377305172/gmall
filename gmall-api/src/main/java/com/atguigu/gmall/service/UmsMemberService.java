package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ä¼šå‘˜è¡¨(UmsMember)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:04:49
 */
@Mapper
public interface UmsMemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMember queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMember> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    UmsMember insert(UmsMember umsMember);

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    UmsMember update(UmsMember umsMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}