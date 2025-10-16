package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbCheckin;
import org.springframework.stereotype.Repository;

@Repository
public interface TbCheckinmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCheckin record);

    int insertSelective(TbCheckin record);

    TbCheckin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCheckin record);

    int updateByPrimaryKey(TbCheckin record);
}