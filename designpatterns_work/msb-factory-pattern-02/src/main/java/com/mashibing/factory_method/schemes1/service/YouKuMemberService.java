package com.mashibing.factory_method.schemes1.service;

/**
 * 模拟优酷会员服务
 * @author spikeCong
 * @date 2022/9/7
 **/
public class YouKuMemberService {

    public void openMember(String bindMobile , String number){

        System.out.println("发放优酷会员: " + bindMobile + " , " + number);
    }
}
