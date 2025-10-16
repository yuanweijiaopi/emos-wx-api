package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbPermission;
import org.springframework.stereotype.Repository;

@Repository
public interface TbPermissionmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
}