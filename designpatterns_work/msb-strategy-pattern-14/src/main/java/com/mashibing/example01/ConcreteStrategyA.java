package com.mashibing.example01;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}
