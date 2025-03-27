package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbWorkday;
import org.springframework.stereotype.Repository;

@Repository
public interface TbWorkdaymapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWorkday record);

    int insertSelective(TbWorkday record);

    TbWorkday selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWorkday record);

    int updateByPrimaryKey(TbWorkday record);
}