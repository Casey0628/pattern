package com.enjoy.pattern.structure.bridge.bag;

import com.enjoy.pattern.structure.bridge.material.Material;

/**
 * 采摘容器
 */
public abstract class BagAbstraction {
    protected Material material;
//    protected Material material;

    public void setMaterial(Material material){
        this.material = material;
    }

    //采摘
    public abstract void pick();

}
