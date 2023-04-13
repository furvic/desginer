package com.mashibing.factory_method.schemes2.service.impl;

import com.mashibing.factory_method.schemes2.entity.AwardInfo;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;
import com.mashibing.factory_method.schemes2.service.IFreeGoods;

/**
 * 模拟打折券服务
 * @author spikeCong
 * @date 2022/9/8
 **/
public class DiscountFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        System.out.println("向用户发放打折券一张: " + awardInfo.getUid() + " , " + awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功!");
    }

}
