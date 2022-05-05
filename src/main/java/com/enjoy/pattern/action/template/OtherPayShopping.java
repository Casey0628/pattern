package com.enjoy.pattern.action.template;

import java.util.List;

import com.enjoy.pattern.entity.Fruit;

/**
 * 模板方法模式
 * 购物车费用结算过程
 */
public class OtherPayShopping extends ShoppingCart{


    public OtherPayShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("代付成功");
    }

}
