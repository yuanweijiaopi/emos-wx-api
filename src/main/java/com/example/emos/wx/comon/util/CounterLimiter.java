package com.example.emos.wx.comon.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName CounterLimiter
 * @Description TODO
 * @Author aql
 * @Date 2025/10/20 10:12
 * @Version 1.0
 **/
public class CounterLimiter {
    // 起始时间
    private static long startTime = System.currentTimeMillis();
    //时间区间的时间间隔 1s
    private static long interval = 1000;
    //每秒限制数量
    private static long maxCount = 2;
    //累加器
    private static AtomicLong accumulator = new AtomicLong();


    //计数判断 ，是否超出限制
    private static long tryAcquire(){
        long newTime = System.currentTimeMillis();

        //判断是否超过限制时间
        if (newTime - startTime > interval){}

        return 1;
    }
}
