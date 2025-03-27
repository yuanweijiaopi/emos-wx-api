package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.TbCity;
import org.springframework.stereotype.Repository;

@Repository
public interface TbCitymapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCity record);

    int insertSelective(TbCity record);

    TbCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCity record);

    int updateByPrimaryKey(TbCity record);
}