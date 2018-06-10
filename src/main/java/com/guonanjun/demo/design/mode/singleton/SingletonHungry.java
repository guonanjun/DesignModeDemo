/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.singleton;

/**
 * 单例模式-饿汉（线程安全）
 *
 * @author guonanjun
 * @date 2018-06-09
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
