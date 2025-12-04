package com.example.emos.wx.gen.repo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.emos.wx.exception.EmosException;
import com.example.emos.wx.gen.po.TbUser;
import com.example.emos.wx.gen.dao.TbUserMapper;
import com.example.emos.wx.gen.po.TbUserCol;
import com.example.emos.wx.gen.repo.TbUserRepo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Set;

@Slf4j
@Repository
public class TbUserRepoImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserRepo {
    @Override
    public Integer searchIdByOpenId(String openId) {
        TbUser tbUser = baseMapper.selectOne(new QueryWrapper<TbUser>().eq(TbUserCol.OPEN_ID, openId).eq(TbUserCol.STATUS, 1));

        if (tbUser != null) {
            return tbUser.getId();
        }else {
            throw new EmosException("<UNK>openId<UNK>");
        }
    }

    @Override
    public Set<String> searchUserPermission() {
        return Collections.emptySet();
    }


}