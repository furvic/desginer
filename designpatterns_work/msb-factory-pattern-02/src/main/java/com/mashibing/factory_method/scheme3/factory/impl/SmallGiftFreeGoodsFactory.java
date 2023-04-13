package com.mashibing.factory_method.scheme3.factory.impl;

import com.mashibing.factory_method.scheme3.factory.FreeGoodsFactory;
import com.mashibing.factory_method.schemes2.service.IFreeGoods;
import com.mashibing.factory_method.schemes2.service.impl.SmallGiftFreeGoods;

/**
 * 小礼品发放接口-生产工厂
 * @author spikeCong
 * @date 2022/9/9
 **/
public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {

        return new SmallGiftFreeGoods();
    }
}
