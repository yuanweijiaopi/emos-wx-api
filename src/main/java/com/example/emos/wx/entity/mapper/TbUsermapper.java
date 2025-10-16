package com.example.emos.wx.entity.mapper;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface TbUsermapper {
    boolean havaRootUser();

    int insert(HashMap param);

    Integer searchIdByOpenId(String openId);
}