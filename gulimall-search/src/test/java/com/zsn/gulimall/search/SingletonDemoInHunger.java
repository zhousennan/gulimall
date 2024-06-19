package com.zsn.gulimall.search;

/**
 * @Author : zhou sen nan
 * @Date : 2022/5/27  11:11
 */
public class SingletonDemoInHunger {

    public static SingletonDemoInHunger instance = new SingletonDemoInHunger();

    private SingletonDemoInHunger() {
    }

    public static SingletonDemoInHunger getInstance() {
        return instance;
    }
}

class SingletonDemoInLazy {
    public static SingletonDemoInLazy singletonDemoInLazy;

    private SingletonDemoInLazy() {
    }

    public static SingletonDemoInLazy getInstance() {
        if (singletonDemoInLazy == null) {
            singletonDemoInLazy = new SingletonDemoInLazy();
        }
        return singletonDemoInLazy;
    }

}

class SingletonDemoInLazyLock {
    private static SingletonDemoInLazyLock singletonDemoInLazyLock;

    private SingletonDemoInLazyLock() {
    }

    public static synchronized SingletonDemoInLazyLock getInstance() {

        if (singletonDemoInLazyLock == null) {
            singletonDemoInLazyLock = new SingletonDemoInLazyLock();
        }

        return singletonDemoInLazyLock;
    }

}

class Singleton {
    // 私有实例，volatile关键字，禁止指令重排。
    private static volatile Singleton singleton;

    private Singleton() {
    }
    //先判断对象是否已经实例过，没有实例化过才进入加锁代码
    public static  Singleton getInstance() {
        //先判断对象是否已经实例过，没有实例化过才进入加锁代码
        if (singleton == null) {
            //类对象加锁
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
}
