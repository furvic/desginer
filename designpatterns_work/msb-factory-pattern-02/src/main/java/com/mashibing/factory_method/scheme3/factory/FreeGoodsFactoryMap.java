package com.mashibing.factory_method.scheme3.factory;

import com.mashibing.factory_method.scheme3.factory.impl.DiscountFreeGoodsFactory;
import com.mashibing.factory_method.scheme3.factory.impl.SmallGiftFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 用简单方法模式实现: 工厂的工厂,作用是不需要每次创建新的工厂对象
 * @author spikeCong
 * @date 2022/9/9
 **/
public class FreeGoodsFactoryMap {

    private static final Map<Integer,FreeGoodsFactory> cachedFactories = new HashMap<>();

    static{
        cachedFactories.put(1, new DiscountFreeGoodsFactory());
        cachedFactories.put(2, new SmallGiftFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type){
        if(type == 1){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(1);
            return freeGoodsFactory;
        }else if(type ==2){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(2);
            return freeGoodsFactory;
        }

        return null;
    }
}
