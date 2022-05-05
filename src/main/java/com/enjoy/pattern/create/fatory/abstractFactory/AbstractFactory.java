package com.enjoy.pattern.create.fatory.abstractFactory;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
