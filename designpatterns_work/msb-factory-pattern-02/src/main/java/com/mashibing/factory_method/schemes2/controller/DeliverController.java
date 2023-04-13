package com.mashibing.factory_method.schemes2.controller;


import com.mashibing.factory_method.schemes2.entity.AwardInfo;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;
import com.mashibing.factory_method.schemes2.factory.FreeGoodsFactory;
import com.mashibing.factory_method.schemes2.service.IFreeGoods;

/**
 * 发放奖品接口
 * @author spikeCong
 * @date 2022/9/7
 **/
public class DeliverController {

    /**
     * 发放奖品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){

        try {
            IFreeGoods freeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
            ResponseResult responseResult = freeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult("201","奖品发放失败!");
        }
    }

}
