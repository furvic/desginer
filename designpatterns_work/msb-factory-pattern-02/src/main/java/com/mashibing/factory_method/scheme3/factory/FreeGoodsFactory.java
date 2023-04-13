package com.mashibing.factory_method.scheme3.factory;

import com.mashibing.factory_method.schemes2.service.IFreeGoods;

/**
 * 抽象工厂
 * @author spikeCong
 * @date 2022/9/9
 **/
public interface FreeGoodsFactory {

    IFreeGoods getInstance();
}
