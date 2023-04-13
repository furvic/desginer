package com.mashibing.observer.example01;

/**
 * 具体观察者
 * @author spikeCong
 * @date 2022/10/11
 **/
public class ConcreteObserverOne implements Observer {

    @Override
    public void update() {
        //获取消息通知,执行业务代码
        System.out.println("ConcreteObserverOne 得到通知!");
    }
}
