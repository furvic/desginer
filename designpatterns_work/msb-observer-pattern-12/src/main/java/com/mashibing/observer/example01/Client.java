package com.mashibing.observer.example01;

/**
 * @author spikeCong
 * @date 2022/10/11
 **/
public class Client {

    public static void main(String[] args) {
        //创建目标类(被观察者)
        ConcreteSubject subject = new ConcreteSubject();

        //注册观察者类,可以注册多个
        subject.attach(new ConcreteObserverOne());
        subject.attach(new ConcreteObserverTwo());

        //具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
        subject.notifyObservers();
    }
}
