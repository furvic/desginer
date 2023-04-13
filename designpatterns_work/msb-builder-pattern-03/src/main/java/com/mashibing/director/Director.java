package com.mashibing.director;

import com.mashibing.builder.Builder;
import com.mashibing.prouct.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
