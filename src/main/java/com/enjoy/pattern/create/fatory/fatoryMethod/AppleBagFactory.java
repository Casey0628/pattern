package com.enjoy.pattern.create.fatory.fatoryMethod;

import com.enjoy.pattern.entity.Bag;
import com.enjoy.pattern.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
