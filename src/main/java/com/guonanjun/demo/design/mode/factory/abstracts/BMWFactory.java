/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.abstracts;

import com.guonanjun.demo.design.mode.factory.product.car.BMWCar;
import com.guonanjun.demo.design.mode.factory.product.car.Car;
import com.guonanjun.demo.design.mode.factory.product.motorbike.BMWMotorbike;
import com.guonanjun.demo.design.mode.factory.product.motorbike.Motorbike;

/**
 * 宝马车工厂
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class BMWFactory implements AbstractFactory {

    public Car createCar() {
        return new BMWCar();
    }

    public Motorbike createMotorbike() {
        return new BMWMotorbike();
    }
}
