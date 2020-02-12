package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.entity.UmsMemberLevel;
import com.atguigu.gmall.user.service.UmsMemberLevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ä¼šå‘˜ç­‰çº§è¡¨(UmsMemberLevel)表控制层
 *
 * @author makejava
 * @since 2020-02-11 18:44:20
 */
@RestController
@RequestMapping("umsMemberLevel")
public class UmsMemberLevelController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberLevel selectOne(Long id) {
        return this.umsMemberLevelService.queryById(id);
    }

}