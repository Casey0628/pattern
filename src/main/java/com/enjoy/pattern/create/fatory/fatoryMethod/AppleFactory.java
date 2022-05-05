package com.enjoy.pattern.create.fatory.fatoryMethod;

import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.fruit.Apple;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
