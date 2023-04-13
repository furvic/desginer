package com.mashibing.factory_method.schemes1.service;


import com.alibaba.fastjson.JSON;
import com.mashibing.factory_method.schemes1.entity.SmallGiftInfo;

/**
 * 模拟礼品服务
 * @author spikeCong
 * @date 2022/9/7
 **/
public class SmallGiftService {

    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo){

        System.out.println("小礼品已发货,获奖用户注意查收! " + JSON.toJSON(smallGiftInfo));
        return true;
    }

}
