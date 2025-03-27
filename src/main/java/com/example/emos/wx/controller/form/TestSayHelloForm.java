package com.example.emos.wx.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @ClassName TestSayHelloForm
 * @Description TODO
 * @Author aql
 * @Date 2025/3/19 16:25
 * @Version 1.0
 **/
@ApiModel
@Data
public class TestSayHelloForm {
    @NotBlank
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$", message = "姓名必须是2到15个中文字符")
    @ApiModelProperty("姓名")
    private String name;
}
