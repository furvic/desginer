package com.mashibing.singleton.test;

import com.mashibing.singleton.demo03.Singleton_03;
import com.mashibing.singleton.demo05.Singleton_05;
import com.mashibing.singleton.demo06.Singleton_06;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 通过反射-暴力反射获取构造方法,破坏单例对象的唯一性
 * @author spikeCong
 * @date 2022/9/6
 **/
public class Test_Reflect {

    @Test
    public void test01(){

        try {
            Class<Singleton_03> clazz = Singleton_03.class;

            //getDeclaredXxx: 不受权限控制的获取类的成员.
            Constructor c = clazz.getDeclaredConstructor(null);

            //设置为true,就可以对类中的私有成员进行操作了
//            c.setAccessible(true);

            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();

            System.out.println(instance1 == instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() throws Exception {

        Singleton_06 instance = Singleton_06.getInstance();
        instance.setData(new Object());

        Class<Singleton_06> clazz = Singleton_06.class;

        //java.lang.NoSuchMethodException: com.mashibing.singleton.demo06.Singleton_06.<init>()
        //没有这个构造方法
        //Constructor<Singleton_06> constructor = clazz.getDeclaredConstructor();

        Constructor<Singleton_06> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);

        //Cannot reflectively create enum objects
        //不可以用反射创建枚举对象
        Singleton_06 s1 = constructor.newInstance();

        System.out.println(s1);


    }

}
