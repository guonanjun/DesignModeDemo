/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.singleton;

/**
 * 单例模式-懒汉（线程安全）
 *
 * @author guonanjun
 * @date 2018-06-09
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
