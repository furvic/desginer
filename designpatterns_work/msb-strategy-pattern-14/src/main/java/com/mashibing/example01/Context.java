package com.mashibing.example01;

/**
 * 环境类
 * @author spikeCong
 * @date 2022/10/13
 **/
public class Context {

    //维持一个对抽象策略类的引用
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //调用策略类中的算法
    public void algorithm(){
        strategy.algorithm();
    }
}
