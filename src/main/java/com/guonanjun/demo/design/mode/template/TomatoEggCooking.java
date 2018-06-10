/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.template;

/**
 * 番茄炒蛋
 *
 * @author guonanjun
 * @date 2018-06-09
 */
public class TomatoEggCooking extends ChineseCooking {

    @Override
    protected void putDish() {
        System.out.println("放入西红柿和鸡蛋");
    }

    @Override
    protected void putSeasoning() {
        System.out.println("放盐");
    }

    @Override
    protected void stir() {
        System.out.println("翻炒4分钟");
    }
}
