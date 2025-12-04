package com.example;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @ClassName BloomFilterTest
 * @Description TODO
 * @Author aql
 * @Date 2025/11/8 14:38
 * @Version 1.0
 **/
public class BloomFilterTest {

    //预计插入的数据
    private static Integer expectedInsertions = 10000000;

    //误判率
    private static Double fpp = 0.001;

    //布隆过滤器
    private static com.google.common.hash.BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), expectedInsertions, fpp);


    public static void main(String[] args) {
        for (Integer i = 0; i < expectedInsertions; i++) {
            bloomFilter.put(i);
        }

        //测试误判率
        int count = 0;

        for (int i = expectedInsertions; i < expectedInsertions * 2; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
            }

        }
            System.out.println("一共误判了：" + count);

    }
}
