package com.example;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName test03
 * @Description TODO
 * @Author aql
 * @Date 2025/11/6 14:22
 * @Version 1.0
 **/
@Slf4j
public class test03 {
    private static final int HORSE_COUNT = 10;


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //等待线程
        log.info("开始等待");
        countDownLatch.await();

        //工作线程
        log.info("countDown{}", countDownLatch);
        countDownLatch.countDown();
    }


    public static void solution1() throws InterruptedException {
        System.out.println("========== 方案1: CyclicBarrier + CountDownLatch ==========\n");

        CountDownLatch countDownLatch = new CountDownLatch(HORSE_COUNT);

        new CyclicBarrier(HORSE_COUNT,()->{
            System.out.println("🏁 裁判: 所有赛马就绪，比赛开始！\n");
        });

        AtomicInteger ranker = new AtomicInteger(0);
    }
    }
