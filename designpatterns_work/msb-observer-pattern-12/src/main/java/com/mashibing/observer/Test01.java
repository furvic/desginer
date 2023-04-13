package com.mashibing.observer;

import com.mashibing.observer.example02.LotteryResult;
import com.mashibing.observer.example03.LotteryService;
import com.mashibing.observer.example03.LotteryServiceImpl;
import org.junit.Test;

/**
 * @author spikeCong
 * @date 2022/10/11
 **/
public class Test01 {

//    @Test
//    public void test1(){
//        LotteryService ls = new LotteryServiceImpl();
//        LotteryResult result  = ls.lottery("1234567887654322");
//        System.out.println(result);
//    }

    @Test
    public void test2(){
        LotteryService ls = new LotteryServiceImpl();
        LotteryResult result  = ls.lotteryAndMsg("1234567887654322");
        System.out.println(result);
    }
}
