/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.product.car;

/**
 * 奔驰车
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class BenzCar implements Car {

    public void start() {
        System.out.println("汽车启动");
    }

    public void speedUp() {
        System.out.println("汽车加速");
    }

    public void stop() {
        System.out.println("汽车启动");
    }
}
