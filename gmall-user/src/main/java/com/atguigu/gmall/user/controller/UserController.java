package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.entity.UmsMember;
import com.atguigu.gmall.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ä¼šå‘˜è¡¨(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-02-13 17:02:30
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;
    @Resource
    private RestTemplate restTemplate;

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

    @GetMapping("selectAll")
    public List selectAll() {
        Map<String, Object> params = new HashMap<>();
        params.put("offset", 1);
        params.put("limit", 5);
        return this.restTemplate.getForObject("http://PROVIDER-GMALL-API/umsNumber/selectAll?offset={offset}&limit={limit}", List.class, params);
    }

}