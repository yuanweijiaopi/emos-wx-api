package com.example.emos.wx.gen.repo;

import com.example.emos.wx.gen.po.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

public interface TbUserRepo extends IService<TbUser> {
    Integer searchIdByOpenId(String openId);

    Set<String> searchUserPermission();
}