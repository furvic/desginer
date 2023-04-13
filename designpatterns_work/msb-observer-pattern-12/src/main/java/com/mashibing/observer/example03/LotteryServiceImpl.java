package com.mashibing.observer.example03;

import com.mashibing.observer.example02.DrawHouseService;
import com.mashibing.observer.example02.LotteryResult;

import java.util.Date;

/**
 * 开奖服务
 * @author spikeCong
 * @date 2022/10/11
 **/
public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}
