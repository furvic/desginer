package com.mashibing.mediator.example01;

/**
 * 抽象组件类
 * @author spikeCong
 * @date 2022/10/20
 **/
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void exec(String key);
}
