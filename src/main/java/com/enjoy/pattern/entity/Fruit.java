package com.enjoy.pattern.entity;

import com.enjoy.pattern.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
