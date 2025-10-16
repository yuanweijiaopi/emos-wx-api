package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbAction;
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