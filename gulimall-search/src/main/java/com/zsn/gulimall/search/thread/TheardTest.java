package com.zsn.gulimall.search.thread;


import java.util.concurrent.*;

/**
 * @Author : zhou sen nan
 * @Date : 2022/4/21  16:06
 */
public class TheardTest {

    public static ExecutorService service = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("thread begin");
         CompletableFuture.supplyAsync(() -> {
            System.out.println("now Thread" + Thread.currentThread());
            int i = 10 / 2;
            return i;
        }, service).thenRunAsync(()->{
             System.out.println("task 2 start");
        },service);
        //System.out.println(future.get());
        System.out.println("thread end ");
    }
}
