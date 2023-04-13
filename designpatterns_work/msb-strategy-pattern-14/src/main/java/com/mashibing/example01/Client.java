package com.mashibing.example01;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class Client {

    public static void main(String[] args) {


        Strategy strategyA  = new ConcreteStrategyA();
        Context context = new Context(strategyA); //可以在运行时指定类型,通过配置文件+反射机制实现
        context.algorithm();
    }
}
