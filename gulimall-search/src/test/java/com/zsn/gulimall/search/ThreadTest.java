package com.zsn.gulimall.search;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author : zhou sen nan
 * @Date : 2022/6/8  14:16
 */
public class ThreadTest {
    public static int c;

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        reentrantLock.lock();
        reentrantLock.unlock();
        final int a;
        a = 0;
        System.out.println(a);
        ThreadTest threadTest = new ThreadTest();
        threadTest.test();
    }

    public void test() {
        final int b;
        b = 1;
        c=1;
        System.out.println(c);
    }

}
