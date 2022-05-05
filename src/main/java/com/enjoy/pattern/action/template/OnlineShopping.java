package com.enjoy.pattern.action.template;

import java.util.List;

import com.enjoy.pattern.entity.Fruit;
import com.enjoy.pattern.service.OrderService;
import com.enjoy.pattern.service.impl.OrderServiceImpl;

/**
 * 模板方法模式
 * 购物车费用结算过程
 */
public class OnlineShopping extends ShoppingCart{
    private OrderService orderService = new OrderServiceImpl();

    public OnlineShopping(List<Fruit> products) {
        super(products);
    }
    @Override
    protected void pay(int money) {
        System.out.println("微信/支付宝结算，减免5元,请支付："+(money - 5)+"元");
        int orderId = orderService.saveOrder();

    }
}
