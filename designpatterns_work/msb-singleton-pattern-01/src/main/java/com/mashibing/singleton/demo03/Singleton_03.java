package com.mashibing.singleton.demo03;

import com.mashibing.singleton.demo02.Singleton_02;

/**
 * 单例模式-懒汉式(线程安全)
 * @author spikeCong
 * @date 2022/9/2
 **/
public class Singleton_03 {

    //用于存储单一实例的静态对象
    private static Singleton_03 instance;

    //私有的构造方法
    private Singleton_03(){

    }

    //添加synchronize,保证多线程模式下的单例对象的唯一性
    public static synchronized Singleton_03 getInstance(){
        if(instance == null){
            instance = new Singleton_03();
        }

        return instance;
    }
}
