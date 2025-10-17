package com.example.gen.dao;

import com.example.gen.po.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface TbUserMapper extends BaseMapper<com.example.gen.po.TbUser> {
    boolean havaRootUser();

    int insert(HashMap param);

    Integer searchIdByOpenId(String openId);
}