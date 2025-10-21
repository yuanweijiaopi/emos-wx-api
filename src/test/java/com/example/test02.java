package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @ClassName test02
 * @Description TODO
 * @Author aql
 * @Date 2025/10/20 15:49
 * @Version 1.0
 **/
public class test02 {

    public static void test(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(numbers.stream().filter(isEven).collect(Collectors.toList()));

    }

    public static void main(String[] args) {
        test();
    }
}
