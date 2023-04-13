package com.mashibing.factory_method.demo;

/**
 * 具体产品实现B
 * @author spikeCong
 * @date 2022/9/8
 **/
public class Product_B_Impl implements IProduct {

    @Override
    public void use() {

        System.out.println("use B Product now");
    }

}
