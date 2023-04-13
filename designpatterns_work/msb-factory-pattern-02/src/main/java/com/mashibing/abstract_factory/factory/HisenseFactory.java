package com.mashibing.abstract_factory.factory;

import com.mashibing.abstract_factory.product.AbstractTV;
import com.mashibing.abstract_factory.product.AbstractFreezer;
import com.mashibing.abstract_factory.product.HisenseFreezer;
import com.mashibing.abstract_factory.product.HisenseTV;

/**
 * @author spikeCong
 * @date 2022/9/14
 **/
public class HisenseFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
