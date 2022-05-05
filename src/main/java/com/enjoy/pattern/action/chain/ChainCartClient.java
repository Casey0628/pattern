package com.enjoy.pattern.action.chain;

import java.util.ArrayList;
import java.util.List;

import com.enjoy.pattern.action.template.OtherPayShopping;
import com.enjoy.pattern.action.template.ShoppingCart;
import com.enjoy.pattern.create.fatory.simple.StaticFactory;
import com.enjoy.pattern.entity.Fruit;

/**
 * 订单费用结算过程
 * 责任链模式，多个优惠卷全部调用，经典使用场景servelt 中的多个filter以及审批流程
 * 当多个对象可以处理统一请求时，适合责任链模式
 */
public class ChainCartClient {

    //初始化满减优惠券
    private static MultyDiscount multyDiscount = new FullMultyDiscount(null);
    static {
        multyDiscount = new NewerMultyDiscount(multyDiscount);
        multyDiscount = new SecondMultyDiscount(multyDiscount);
        multyDiscount = new HolidayMultyDiscount(multyDiscount);


    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        //注入优惠方案
        cart.setDiscount(multyDiscount);

        cart.submitOrder();
    }


}
