package com.mashibing.factory_method.schemes1.service;

import com.mashibing.factory_method.schemes1.entity.DiscountResult;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;

/**
 * 模拟打折券服务
 * @author spikeCong
 * @date 2022/9/7
 **/
public class DiscountService {

    public DiscountResult sendDiscount(String uid, String number){

        System.out.println("向用户发放打折券一张: " + uid + " , " + number);
        return new DiscountResult("200","发放打折券成功");
    }

}
