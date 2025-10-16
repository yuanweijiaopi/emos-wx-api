package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbModule;
import org.springframework.stereotype.Repository;

@Repository
public interface TbModulemapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    TbModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}