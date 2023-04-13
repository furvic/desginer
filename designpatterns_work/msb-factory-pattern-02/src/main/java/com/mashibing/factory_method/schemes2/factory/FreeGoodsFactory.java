package com.mashibing.factory_method.schemes2.factory;

import com.mashibing.factory_method.schemes2.service.IFreeGoods;
import com.mashibing.factory_method.schemes2.service.impl.DiscountFreeGoods;
import com.mashibing.factory_method.schemes2.service.impl.SmallGiftFreeGoods;
import com.mashibing.factory_method.schemes2.service.impl.YouKuMemberFreeGoods;

/**
 * 具体工厂: 生成赠品
 * @author spikeCong
 * @date 2022/9/8
 **/
public class FreeGoodsFactory {

    public static IFreeGoods getInstance(Integer awardType){

        IFreeGoods iFreeGoods = null;

        if(1 == awardType ){ //打折券

            iFreeGoods = new DiscountFreeGoods();
        }else if(2 == awardType){ //优酷会员

            iFreeGoods = new YouKuMemberFreeGoods();
        }else if(3 == awardType){ //小礼品

            iFreeGoods = new SmallGiftFreeGoods();
        }

        return iFreeGoods;
    }
}
