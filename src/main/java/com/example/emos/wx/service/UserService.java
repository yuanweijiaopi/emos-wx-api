package com.example.emos.wx.service;

import com.example.emos.wx.db.mapper.TbUsermapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author aql
 * @Date 2025/3/31 17:25
 * @Version 1.0
 **/
public interface UserService {

    public int registerUser(String registerCode,String code,String nickname,String photo);

}
