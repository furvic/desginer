package com.mashibing.test;

import com.mashibing.factory_method.scheme3.controller.DeliverController;
import com.mashibing.factory_method.schemes2.entity.AwardInfo;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;
import org.junit.Test;

/**
 * @author spikeCong
 * @date 2022/9/9
 **/
public class TestApi03 {

    DeliverController deliverController = new DeliverController();

    @Test
    public void test01(){

        //1. 发放打折券优惠
        AwardInfo info1 = new AwardInfo();
        info1.setUid("1001");
        info1.setAwardType(1);
        info1.setAwardNumber("DEL12345");

        ResponseResult result = deliverController.awardToUser(info1);
        System.out.println(result);

    }

}
