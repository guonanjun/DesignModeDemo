/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.abstracts;

import com.guonanjun.demo.design.mode.factory.product.car.BMWCar;
import com.guonanjun.demo.design.mode.factory.product.car.Car;
import com.guonanjun.demo.design.mode.factory.product.motorbike.BenzMotorbike;
import com.guonanjun.demo.design.mode.factory.product.motorbike.Motorbike;

/**
 * 奔驰车工厂
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class BenzFactory implements AbstractFactory {

    public Car createCar() {
        return new BMWCar();
    }


    public Motorbike createMotorbike() {
        return new BenzMotorbike();
    }
}
