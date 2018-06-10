/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.template;

/**
 * 辣椒炒肉
 *
 * @author guonanjun
 * @date 2018-06-09
 */
public class CapsicumMeatCooking extends ChineseCooking {

    @Override
    protected void putDish() {
        System.out.println("放入辣椒和肉");
    }

    @Override
    protected void putSeasoning() {
        System.out.println("放入盐和酱油");
    }

    @Override
    protected void stir() {
        System.out.println("翻炒5分钟");
    }
}
