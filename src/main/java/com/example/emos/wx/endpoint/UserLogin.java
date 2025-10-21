package com.example.emos.wx.endpoint;

import com.example.emos.wx.bean.common.Result;
import com.example.emos.wx.bean.request.LoginReq;
import com.example.emos.wx.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserLogin
 * @Description TODO
 * @Author aql
 * @Date 2025/10/21 09:47
 * @Version 1.0
 **/
@RestController
@RequestMapping("/login")
@Api(tags = "登陆系统")
public class UserLogin {
    @Resource
    private UserService userService;

    @PostMapping("login")
    @ApiOperation("登陆")
    public Result login(@Validated @RequestBody LoginReq loginReq){
        userService.login(loginReq);
        return null;
    }
}
