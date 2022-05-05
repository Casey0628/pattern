package com.enjoy.pattern.create.fatory.fatoryMethod;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    public Bag getBag(){
        return new BananaBag();
    }
}
