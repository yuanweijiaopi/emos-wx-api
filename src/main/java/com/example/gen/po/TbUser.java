package com.example.gen.po;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class TbUser {

    /**
     * 主键 | tb_user.id | @mbg.generated
     */
    @ApiModelProperty("主键")
    private Integer id;

    /**
     * 长期授权字符串 | tb_user.open_id | @mbg.generated
     */
    @ApiModelProperty("长期授权字符串")
    private String openId;

    /**
     * 昵称 | tb_user.nickname | @mbg.generated
     */
    @ApiModelProperty("昵称")
    private String nickname;

    /**
     * 头像网址 | tb_user.photo | @mbg.generated
     */
    @ApiModelProperty("头像网址")
    private String photo;

    /**
     * 姓名 | tb_user.name | @mbg.generated
     */
    @ApiModelProperty("姓名")
    private String name;

    /**
     * 性别 | tb_user.sex | @mbg.generated
     */
    @ApiModelProperty("性别")
    private String sex;

    /**
     * 手机号码 | tb_user.tel | @mbg.generated
     */
    @ApiModelProperty("手机号码")
    private String tel;

    /**
     * 邮箱 | tb_user.email | @mbg.generated
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 入职日期 | tb_user.hiredate | @mbg.generated
     */
    @ApiModelProperty("入职日期")
    private Date hiredate;

    /**
     * 是否是超级管理员 | tb_user.root | @mbg.generated
     */
    @ApiModelProperty("是否是超级管理员")
    private Boolean root;

    /**
     * 部门编号 | tb_user.dept_id | @mbg.generated
     */
    @ApiModelProperty("部门编号")
    private Integer deptId;

    /**
     * 状态 | tb_user.status | @mbg.generated
     */
    @ApiModelProperty("状态")
    private Byte status;

    /**
     * 创建时间 | tb_user.create_time | @mbg.generated
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 角色 | tb_user.role | @mbg.generated
     */
    @ApiModelProperty("角色")
    private String role;

}