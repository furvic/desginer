package com.mashibing.factory_method.schemes2.service;

import com.mashibing.factory_method.schemes2.entity.AwardInfo;
import com.mashibing.factory_method.schemes2.entity.ResponseResult;

/**
 * 免费商品接口
 * @author spikeCong
 * @date 2022/9/8
 **/
public interface IFreeGoods {

    //发放赠品
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
