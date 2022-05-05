package com.enjoy.pattern.structure.bridge;

import com.enjoy.pattern.structure.bridge.bag.BagAbstraction;
import com.enjoy.pattern.structure.bridge.bag.SmallBag;
import com.enjoy.pattern.structure.bridge.material.Material;
import com.enjoy.pattern.structure.bridge.material.Paper;

/**
 * 园丁采摘水果
 *
 * 桥接模式
 * 不同材质大小的袋子进行选择 　　大中小袋子和塑料，丝绸材质进行搭配　 　　　　　　　　　　　　　　　　　　　 　
 */
public class BridgeClient {

    public static void main(String[] args) {

        //袋子型号
        BagAbstraction bag = new SmallBag();

        //袋子材质
        Material material = new Paper();
        bag.setMaterial(material);

        //开始采摘
        bag.pick();
    }
}
