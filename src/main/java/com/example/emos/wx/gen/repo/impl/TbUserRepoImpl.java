package com.example.emos.wx.gen.repo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.emos.wx.gen.po.TbUser;
import com.example.emos.wx.gen.dao.TbUserMapper;
import com.example.emos.wx.gen.po.TbUserCol;
import com.example.emos.wx.gen.repo.TbUserRepo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class TbUserRepoImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserRepo {
    @Override
    public Integer searchIdByOpenId(String openId) {
        QueryWrapper<TbUser> havaOpenId = new QueryWrapper<TbUser>().eq(TbUserCol.OPEN_ID, openId).eq(TbUserCol.STATUS, 1);
        if (havaOpenId != null) {
            return 1;
        }
        return 0;
    }
}