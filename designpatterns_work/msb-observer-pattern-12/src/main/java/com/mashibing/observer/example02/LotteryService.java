package com.mashibing.observer.example02;

/**
 * 开奖服务接口
 * @author spikeCong
 * @date 2022/10/11
 **/
public interface LotteryService {

    //摇号相关业务
    public LotteryResult lottery(String uId);
}
