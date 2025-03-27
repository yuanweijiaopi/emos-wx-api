package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUsermapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}