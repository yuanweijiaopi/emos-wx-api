package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRole;
import org.springframework.stereotype.Repository;

@Repository
public interface TbRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}