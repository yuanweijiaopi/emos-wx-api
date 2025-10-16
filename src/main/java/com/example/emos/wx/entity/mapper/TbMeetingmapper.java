package com.example.emos.wx.entity.mapper;

import com.example.emos.wx.entity.pojo.TbMeeting;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMeetingmapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbMeeting record);

    int insertSelective(TbMeeting record);

    TbMeeting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbMeeting record);

    int updateByPrimaryKey(TbMeeting record);
}