/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.factory.abstracts;

import com.guonanjun.demo.design.mode.factory.product.car.Car;
import com.guonanjun.demo.design.mode.factory.product.motorbike.Motorbike;

/**
 * 抽象工厂
 *
 * @author guonanjun
 * @date 2018-06-10
 */
public interface AbstractFactory {

    Car createCar();

    Motorbike createMotorbike();

}
