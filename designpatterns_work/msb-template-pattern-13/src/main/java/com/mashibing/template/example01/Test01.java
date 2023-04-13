package com.mashibing.template.example01;

/**
 * @author spikeCong
 * @date 2022/10/12
 **/
public class Test01 {

    public static void main(String[] args) {
        AbstractClassTemplate concreteClassA = new ConcreteClassA();
        concreteClassA.run("");

        System.out.println("===========");

        AbstractClassTemplate concreteClassB = new ConcreteClassB();
        concreteClassB.run("x");
    }
}
