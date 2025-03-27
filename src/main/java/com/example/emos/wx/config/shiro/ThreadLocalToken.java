package com.example.emos.wx.config.shiro;

import org.springframework.stereotype.Component;

/**
 * @ClassName ThreadLocalToken
 * @Description TODO
 * @Author aql
 * @Date 2025/3/26 10:50
 * @Version 1.0
 **/
@Component
public class ThreadLocalToken {
    private ThreadLocal threadLocal = new ThreadLocal();

    public void setToken(String token) {
        threadLocal.set(token);
    }

    public String getToken() {
        return (String) threadLocal.get();
    }

    public void clear(){
        threadLocal.remove();
    }

}
