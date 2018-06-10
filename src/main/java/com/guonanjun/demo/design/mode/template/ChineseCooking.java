/*
 * Copyright (c) 2018. guonanjun.com. All Rights Reserved.
 */

package com.guonanjun.demo.design.mode.template;

/**
 * 中式烹饪
 *
 * @author guonanjun
 * @date 2018-06-09
 */
public abstract class ChineseCooking {


    public final void cook() {
        // 1、放油
        this.putOil();
        // 2、热油
        this.heatOil();
        // 3、放菜
        this.putDish();
        // 4、放调料
        this.putSeasoning();
        // 5、搅拌
        this.stir();

    }

    private void putOil() {
        System.out.println("放入花生油");
    }

    private void heatOil() {
        System.out.println("把油加热一分钟 ");
    }

    protected abstract void putDish();

    protected abstract void putSeasoning();

    protected abstract void stir();



}
