/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.product.motorbike;

/**
 * 宝马摩托
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class BMWMotorbike implements Motorbike {

    public void start() {
        System.out.println("摩托车启动");
    }

    public void speedUp() {
        System.out.println("摩托车加速");
    }

    public void stop() {
        System.out.println("摩托车启动");
    }
}
