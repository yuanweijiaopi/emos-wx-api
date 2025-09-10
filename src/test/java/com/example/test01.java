package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName test01
 * @Description TODO
 * @Author aql
 * @Date 2025/4/16 16:11
 * @Version 1.0
 **/
@SpringBootTest
public class test01 {
    @Test
    public void test01() {
        List<String> list = Arrays.asList("1,2,22,46,87,41,24");
//        List<String> collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);
//        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        list.stream()
                .sorted(Comparator
                        .comparing(String::length)
                        .thenComparing(String::compareTo))
                .forEach(System.out::println);
    }
}
