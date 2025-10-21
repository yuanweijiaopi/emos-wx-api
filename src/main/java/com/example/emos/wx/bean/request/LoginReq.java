package com.example.emos.wx.bean.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName LoginReq
 * @Description TODO
 * @Author aql
 * @Date 2025/10/21 09:49
 * @Version 1.0
 **/
@Data
public class LoginReq {
    @NotBlank(message = "临时授权code不能为空")
    private String code;
}
