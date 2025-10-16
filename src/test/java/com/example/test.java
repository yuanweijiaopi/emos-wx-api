package com.example;

import com.example.emos.wx.entity.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


/**
 * @ClassName test
 * @Description TODO
 * @Author aql
 * @Date 2025/3/27 16:35
 * @Version 1.0
 **/
@SpringBootTest
public class test {
    @Test
    public void contextLoads() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"name\":\"Alice\",\"age\":25}";
        User user = objectMapper.readValue(json, User.class);
        System.out.println(user);
    }


    @Test
    public void test1()  {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.length()>3)
                .findFirst().ifPresent(System.out::println);
    }

}
