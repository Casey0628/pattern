package com.enjoy.pattern.create.fatory.abstractFactory;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.entity.bag.OrangeBag;
import com.enjoy.pattern.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
