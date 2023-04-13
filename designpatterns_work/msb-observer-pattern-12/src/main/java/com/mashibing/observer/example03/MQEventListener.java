package com.mashibing.observer.example03;

import com.mashibing.observer.example02.LotteryResult;

/**
 * MQ消息发送事件
 * @author spikeCong
 * @date 2022/10/11
 **/
public class MQEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户摇号结果(MQ), 用户ID:" +  result.getuId() +
                ",摇号结果:" + result.getMsg());
    }
}
