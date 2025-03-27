package com.example.emos.wx.db.mapper;

import com.example.emos.wx.db.pojo.SysConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface SysConfigmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}