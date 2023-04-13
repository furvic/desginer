package com.mashibing.mediator.example02;

/**
 * 抽象同事类
 * @author spikeCong
 * @date 2022/10/20
 **/
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
