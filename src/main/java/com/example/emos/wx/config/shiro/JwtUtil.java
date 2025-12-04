package com.example.emos.wx.config.shiro;
import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.example.emos.wx.exception.EmosException;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName JwtUtil
 * @Description TODO
 * @Author aql
 * @Date 2025/3/21 14:53
 * @Version 1.0
 **/
@Component
@Slf4j
public class JwtUtil {
    //密钥

    @Value("${emos.jwt.secret}")
    private String secret;

    @Value("${emos.jwt.expire}")
    private int expire;


    public String createToken(int userId) {
        Date date = DateUtil.offset(new Date(), DateField.DAY_OF_YEAR, expire).toJdkDate();
        //创建加密算法对象
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTCreator.Builder builder = JWT.create();
        return builder.withClaim("userId", userId).withExpiresAt(date).sign(algorithm);
    }

    public int getUserId(String token) {
        try{
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userId").asInt();
        }catch (Exception e){
            throw new EmosException("令牌无效");
        }
    }

    public void verifyToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm).build();
        verifier.verify(token);
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.offset(new Date(), DateField.DAY_OF_YEAR, 7));


    }

}
