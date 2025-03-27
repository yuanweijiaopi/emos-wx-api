package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbAction;
import org.springframework.stereotype.Repository;

@Repository
public interface TbActionmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAction record);

    int insertSelective(TbAction record);

    TbAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAction record);

    int updateByPrimaryKey(TbAction record);
}