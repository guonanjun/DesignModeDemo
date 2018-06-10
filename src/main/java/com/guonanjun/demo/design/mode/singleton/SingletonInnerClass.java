/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.singleton;

/**
 * 单例模式-静态内部类（线程安全）
 *
 * @author guonanjun
 * @date 2018-06-09
 */
public class SingletonInnerClass {

    private static class SingletonHolder {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {

    }

    public static SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
