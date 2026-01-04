package com.example;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaFoxUtil;
import cn.hutool.core.util.RandomUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SaFoxUtilTest
 * @Description TODO
 * @Author aql
 * @Date 2025/12/5 16:55
 * @Version 1.0
 **/
@SpringBootTest
public class SaFoxUtilTest {

    @Test
    public void testSaFoxUtil() {
        System.out.println(SaFoxUtil.getRandomString(32));
        //StpUtil.login("test", "123456");

        System.out.println(RandomUtil.randomString(32));

        System.out.println(RandomUtil.randomInt(32));
        //String num = SaFoxUtil.getRandomString(6, SaFoxUtil.CHAR_NUMBER);

        List<Integer> strings = new ArrayList<>(3);
        for (int i = 0; i < 30; i++) {
            strings.add(RandomUtil.randomInt(32));
        }
        System.out.println(strings);
        System.out.println(SaFoxUtil.convertListToString(strings));

    }

    public static void main(String[] args) {
        System.out.println(RandomUtil.randomInt(32));
    }
}
