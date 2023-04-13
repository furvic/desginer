package com.mashibing.proxy.example02;

import java.util.List;

/**
 * @author spikeCong
 * @date 2022/9/23
 **/
public class Client {

    public static void main(String[] args) {

        //目标对象
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());

        //代理对象
        UserServiceImpl proxy = (UserServiceImpl) new UserLogProxy(userService).getLogProxy();
        System.out.println(proxy.getClass());

        List<User> userList = proxy.findUserList();
        System.out.println("用户信息: "+userList);
    }
}
