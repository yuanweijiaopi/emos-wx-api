package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface TbUsermapper {
    boolean havaRootUser();

    int insert(HashMap param);

    Integer searchIdByOpenId(String openId);
}