package com.enjoy.pattern.create.fatory.abstractFactory;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.bag.AppleBag;
import com.enjoy.pattern.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
