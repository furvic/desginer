package com.mashibing.builder;

import com.mashibing.prouct.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
