package com.mashibing.singleton.demo02;

import com.mashibing.singleton.demo01.Singleton_01;

/**
 * 单例模式-懒汉式(线程不安全)
 * @author spikeCong
 * @date 2022/9/2
 **/
public class Singleton_02 {

    //用于存储单一实例的静态对象
    private static Singleton_02 instance;

    //私有的构造方法
    private Singleton_02(){

    }

    //通过判断对象是否被初始化,来选择是否创建对象
    public static Singleton_02 getInstance(){
        if(instance == null){
            instance = new Singleton_02();
        }

        return instance;
    }
}
