package com.enjoy.pattern.create.fatory.abstractFactory;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.bag.BananaBag;
import com.enjoy.pattern.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
