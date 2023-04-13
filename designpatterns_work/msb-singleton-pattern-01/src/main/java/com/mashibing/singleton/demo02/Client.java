package com.mashibing.singleton.demo02;

import com.mashibing.singleton.demo01.Singleton_01;

/**
 * @author spikeCong
 * @date 2022/9/2
 **/
public class Client {

    public static void main(String[] args) {

        for (int i = 0; i < 300; i++) {
            new Thread(() -> {
                Singleton_02 instance = Singleton_02.getInstance();
                System.out.println(Thread.currentThread().getName() + "-----" + instance);
            }).start();
        }
    }
}
