package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName WebClientTest
 * @Description TODO
 * @Author aql
 * @Date 2025/12/5 10:34
 * @Version 1.0
 **/
@SpringBootTest
public class WebClientTest {

    @Resource
    private RestTemplate restTemplate;

    @TestConfiguration
    static class TestConfig {
        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

    @Test
    public void test() {
        System.out.println(restTemplate.getForObject("https://www.baidu.com/", String.class));
    }


}
