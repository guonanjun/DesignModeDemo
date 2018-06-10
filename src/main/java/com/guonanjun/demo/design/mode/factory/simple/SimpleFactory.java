/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.simple;

import com.guonanjun.demo.design.mode.factory.product.car.BenzCar;
import com.guonanjun.demo.design.mode.factory.product.car.Car;

/**
 * 简单工厂
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public class SimpleFactory {

    public static Car createCar(String type) {
        if (type.equals("BMW")) {
            return new BenzCar();
        } else if (type.equals("Benz")) {
            return new BenzCar();
        }
        return null;
    }
}
