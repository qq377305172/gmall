package com.atguigu.gmall.controller;

import com.atguigu.gmall.entity.UmsMember;
import com.atguigu.gmall.service.UmsMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Whyn
 * @date 2020/2/15 16:43
 */
@RestController
@RequestMapping("umsNumber")
public class UmsMumberController {
    @Resource
    private UmsMemberService umsMemberService;

    @GetMapping("selectAll")
    @ResponseBody
    public List<UmsMember> selectAll(Integer offset, Integer limit) {
        return umsMemberService.queryAllByLimit(offset, limit);

    }
}
