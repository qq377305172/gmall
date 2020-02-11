package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.entity.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ä¼šå‘˜è¡¨(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-02-11 16:57:40
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(Long id) {
        return this.umsMemberService.queryById(id);
    }

}