package com.mashibing.proxy.example01;


import org.junit.jupiter.api.Test;

/**
 * @author spikeCong
 * @date 2022/9/22
 **/
public class TestProxy {

    @Test
    public void testStaticProxy(){

        //目标对象
        UserDaoImpl userDao = new UserDaoImpl();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }

    public static void main(String[] args) {
        IUserDao target = new UserDaoImpl();
        System.out.println(target.getClass());//目标对象信息

        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass()); //输出代理对象信息
        proxy.save(); //执行代理方法

        while(true){}
    }

}
