/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.method;

import com.guonanjun.demo.design.mode.factory.product.car.BMWCar;
import com.guonanjun.demo.design.mode.factory.product.car.Car;

/**
 * 宝马车工厂
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class BMWCarFactory implements FactoryMethod {

    public Car createCar() {
        return new BMWCar();
    }

}
