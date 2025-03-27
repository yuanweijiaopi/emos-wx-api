package com.example.emos.wx.controller;

import com.example.emos.wx.comon.util.R;
import com.example.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author aql
 * @Date 2025/3/19 16:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
@Api("测试Web接口")
public class TestController {
    @PostMapping("/sayHello")
    @ApiOperation("测试")
    public R sayHello(@Validated @RequestBody TestSayHelloForm form) {
        return R.ok().put("msg", "hello world"+form.getName());

    }
}
