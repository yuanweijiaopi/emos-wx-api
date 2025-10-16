package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbHolidays;
import org.springframework.stereotype.Repository;

@Repository
public interface TbHolidaysmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHolidays record);

    int insertSelective(TbHolidays record);

    TbHolidays selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbHolidays record);

    int updateByPrimaryKey(TbHolidays record);
}