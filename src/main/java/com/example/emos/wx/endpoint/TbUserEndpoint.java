package com.example.emos.wx.endpoint;

import com.example.emos.wx.bean.common.Result;
import com.example.emos.wx.comon.util.R;
import com.example.emos.wx.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/TbUser")
@Api(tags = "")
public class TbUserEndpoint {
    @Resource
    private UserService userService;

    @GetMapping("havaRootUser")
    public Result<Boolean> haveRootUser(){
        userService.haveRootUser();
        return Result.succ();
    }


}
