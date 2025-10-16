package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbFaceModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TbFaceModelmapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbFaceModel record);

    int insertSelective(TbFaceModel record);

    TbFaceModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbFaceModel record);

    int updateByPrimaryKey(TbFaceModel record);
}