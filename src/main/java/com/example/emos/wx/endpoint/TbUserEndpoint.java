package com.example.emos.wx.endpoint;

import com.example.emos.wx.bean.common.Result;
import com.example.emos.wx.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName TbUser
 * @Description TODO
 * @Author aql
 * @Date 2025/10/16 16:55
 * @Version 1.0
 **/
@RestController
@RequestMapping("/tbUser")
@Api(tags = "")
public class TbUserEndpoint {
    @Resource
    private UserService userService;

    @GetMapping("havaRootUser")
    public Result<Boolean> haveRootUser(){
        return Result.succ(userService.haveRootUser());
    }

    @PostMapping("insert")
    public Result userInsert(){
        userService.userInsert();
        return Result.succ();
    }

    @GetMapping("getOpenId")
    public String getOpenId(String code){
        return userService.getOpenId(code);
    }


}
