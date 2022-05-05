package com.enjoy.pattern.structure.adapter;

import com.enjoy.pattern.entity.bag.AppleBag;
import com.enjoy.pattern.entity.bag.OrangeBag;
import com.enjoy.pattern.entity.fruit.Orange;

/**
 * 适配器模式
 * 桔子包装袋不够用，用苹果代替
 */
public class AdapterClient {
	public static void main(String[] args){
		Orange orange = new Orange("peter",100);
		OrangeBag bag = getBag2();
		orange.pack(bag);
	}

	/**
	 * 取桔子包装
	 * @return
     */
//	private static OrangeBag getBag(){
//		OrangeBag bag = new OrangeBag();
//		return bag;
//	}

	private static OrangeBag getBag2(){
		//准备用途苹果盒代替
		AppleBag appleBag = new AppleBag();

		//把苹果盒适配成桔子包装盒
		OrangeBag orangeBag = new OrangeBagAdapter(appleBag);

		return orangeBag;
	}
}
