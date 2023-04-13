package com.mashibing.flyweight.example01;

/**
 * 非共享具体享元类
 * @author spikeCong
 * @date 2022/10/10
 **/
public class UnsharedConcreteFlyweight extends Flyweight {

    private String intrinsicState;

    public UnsharedConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    @Override
    public void operation(String extrinsicState) {
        System.out.println("=== 使用不共享对象,内部状态: " + intrinsicState +",外部状态: " + extrinsicState);
    }
}
