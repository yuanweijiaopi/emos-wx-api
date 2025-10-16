package com.example.emos.wx.service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author aql
 * @Date 2025/3/31 17:25
 * @Version 1.0
 **/
public interface UserService {

    public int registerUser(String registerCode,String code,String nickname,String photo);


    void haveRootUser();
}
