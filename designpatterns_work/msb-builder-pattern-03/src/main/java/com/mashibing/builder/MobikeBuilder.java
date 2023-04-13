package com.mashibing.builder;

import com.mashibing.prouct.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
