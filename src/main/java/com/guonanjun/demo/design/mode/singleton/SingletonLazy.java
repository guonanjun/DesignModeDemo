package com.guonanjun.demo.design.mode.singleton;

/**
 * 单例模式-懒汉（线程安全）
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
