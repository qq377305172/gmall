package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.entity.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * ä¼šå‘˜æ”¶è´§åœ°å€è¡¨(UmsMemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2020-02-11 18:44:21
 */
@RestController
@RequestMapping("umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberReceiveAddress selectOne(Long id) {
        return this.umsMemberReceiveAddressService.queryById(id);
    }

}