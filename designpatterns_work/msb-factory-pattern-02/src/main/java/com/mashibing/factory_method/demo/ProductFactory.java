package com.mashibing.factory_method.demo;

/**
 * 核心工厂
 * @author spikeCong
 * @date 2022/9/8
 **/
public class ProductFactory {

    public static IProduct getProduct(String name){
        if("a".equals(name)){
            return new Product_A_Impl();
        }
        return new Product_B_Impl();
    }

}
