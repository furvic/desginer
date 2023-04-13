package com.mashibing.factory_method.demo;

/**
 * 使用者
 * @author spikeCong
 * @date 2022/9/8
 **/
public class TestApi {

    public static void main(String[] args) {
        IProduct a = ProductFactory.getProduct("a");
        a.use();
        IProduct b = ProductFactory.getProduct("b");
        b.use();
    }
}
