package com.enjoy.pattern.create.fatory.fatoryMethod;

import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.fruit.Banana;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
