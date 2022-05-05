package com.enjoy.pattern.create.fatory.fatoryMethod;

import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("Peter",80);
    }
}
