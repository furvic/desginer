package com.mashibing.factory_method.scheme3.controller;


import com.alibaba.fastjson.JSON;
import com.mashibing.factory_method.scheme3.factory.FreeGoodsFactory;
import com.mashibing.factory_method.scheme3.factory.FreeGoodsFactoryMap;
import com.mashibing.factory_method.scheme3.factory.impl.DiscountFreeGoodsFactory;
import com.mashibing.factory_method.scheme3.factory.impl.SmallGiftFreeGoodsFactory;
import com.mashibing.factory_method.schemes2.entity.AwardInfo;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;
import com.mashibing.factory_method.schemes2.service.IFreeGoods;

import java.util.UUID;

/**
 * 发放奖品接口
 * @author spikeCong
 * @date 2022/9/7
 **/
public class DeliverController {

    /**
     * 按照类型的不同发放商品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){

        //根据类型获取工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardType());

        //从工厂中获取对应实例
        IFreeGoods freeGoods = goodsFactory.getInstance();

        System.out.println("=====工厂方法模式========");
        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);
        return result;
    }
}
