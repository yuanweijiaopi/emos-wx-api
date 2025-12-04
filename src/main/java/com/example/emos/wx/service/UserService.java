package com.example.emos.wx.service;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.emos.wx.bean.request.LoginReq;
import com.example.emos.wx.config.shiro.JwtUtil;
import com.example.emos.wx.exception.EmosException;
import com.example.emos.wx.gen.dao.TbUserMapper;
import com.example.emos.wx.gen.po.TbUser;
import com.example.emos.wx.gen.po.TbUserCol;
import com.example.emos.wx.gen.repo.TbUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author aql
 * @Date 2025/3/31 17:25
 * @Version 1.0
 **/
@Service
public class UserService {
    @Value("${wx.app-id}")
    private String appId;

    @Value("${wx.app-secret}")
    private String appSecret;

    @Resource
    private TbUserMapper tbUsermapper;
    @Resource
    private TbUserRepo tbUserRepo;
    @Autowired
    private JwtUtil jwtUtil;

    public String getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        HashMap map = new HashMap();
        map.put("appid", appId);
        map.put("secret", appSecret);
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");
        String response = HttpUtil.post(url, map);
        JSONObject json = JSONUtil.parseObj(response);
        String openId = json.getStr("openid");
        if (openId == null || openId.length() == 0) {
            throw new RuntimeException("临时登陆凭证错误");
        }
        return openId;
    }


    public int registerUser(String registerCode, String code, String nickname, String photo) {
        //如果邀请码是000000，代表是超级管理员
        //查询超级管理员帐户是否已经绑定
        if ("000000".equals(registerCode)) {
            boolean bool = tbUsermapper.havaRootUser();
            if (!bool) {
                //把当前用户绑定到ROOT帐户
                String openId = getOpenId(code);
                HashMap param = new HashMap();
                param.put("openId", openId);
                param.put("nickname", nickname);
                param.put("photo", photo);
                param.put("role", "[0]");
                param.put("status", 1);
                param.put("createTime", new Date());
                param.put("root", true);
                tbUsermapper.insert(param);
                int id = tbUsermapper.searchIdByOpenId(openId);
                return id;
            } else {
                //如果root已经绑定了，就抛出异常
                throw new EmosException("无法绑定超级管理员账号");
            }
        }
        //TODO 此处还有其他判断内容
        else{
            return 0;
        }
    }


    public Boolean haveRootUser() {
        Long count = tbUserRepo.count(
                new QueryWrapper<TbUser>().eq("root", 1)
        );
        return count > 0;
    }

    @Transactional(rollbackFor = Exception.class)
    public void userInsert() {

    }




    public void login(LoginReq loginReq) {
        String openId = getOpenId(loginReq.getCode());
        Integer id = tbUserRepo.searchIdByOpenId(openId);
        if (id == 0){
            throw new EmosException("帐户不存在");
        }

        String token = jwtUtil.createToken(id);
        Set<String> permSet = tbUserRepo.searchUserPermission();

    }


}
