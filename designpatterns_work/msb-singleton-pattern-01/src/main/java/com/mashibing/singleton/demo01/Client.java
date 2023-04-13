package com.mashibing.singleton.demo01;

/**
 * @author spikeCong
 * @date 2022/9/2
 **/
public class Client {

    public static void main(String[] args) {

        Singleton_01 instance = Singleton_01.getInstance();

        Singleton_01 instance1 = Singleton_01.getInstance();

        System.out.println(instance == instance1);
    }
}
