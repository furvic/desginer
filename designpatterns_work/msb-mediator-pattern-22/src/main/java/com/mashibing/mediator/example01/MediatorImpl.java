package com.mashibing.mediator.example01;

/**
 * @author spikeCong
 * @date 2022/10/20
 **/
public class MediatorImpl implements Mediator {

    @Override
    public void apply(String key) {
        System.out.println("最终中介者执行操作,key为: " + key);
    }
}
