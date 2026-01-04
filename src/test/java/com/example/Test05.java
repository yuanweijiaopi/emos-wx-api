package com.example;

import cn.dev33.satoken.util.SaFoxUtil;
import com.example.emos.wx.bean.response.User;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName Test05
 * @Description TODO
 * @Author aql
 * @Date 2025/12/5 10:12
 * @Version 1.0
 **/
@SpringBootTest
public class Test05 {

    @Resource
    private ObjectMapper objectMapper;


    @Test
        public void test01() throws Exception {
        String json  = "{\"name\":\"张三\",\"age\":18}";
        JsonNode jsonNode = objectMapper.readTree(json);

        System.out.println(jsonNode.get("name").textValue());
        System.out.println(jsonNode.get("age").intValue());
        System.out.println(objectMapper.readTree(json));

        System.out.println(objectMapper.readValue(json, User.class));

        System.out.println(SaFoxUtil.isEmpty(jsonNode));
    }

}
