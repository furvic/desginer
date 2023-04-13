package com.mashibing.builder;

import com.mashibing.prouct.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public class HelloBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
