package com.guonanjun.demo.design.mode.singleton;

/**
 * 单例模式-静态内部类（线程安全）
 */
public class SingletonInnerClass {

    private static class SingletonHolder {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {

    }

    private static SingletonInnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
