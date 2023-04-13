package com.mashibing;

import com.mashibing.builder.Builder;
import com.mashibing.builder.HelloBuilder;
import com.mashibing.builder.MobikeBuilder;
import com.mashibing.director.Director;
import com.mashibing.prouct.Bike;

/**
 * @author spikeCong
 * @date 2022/9/16
 **/
public class Client {

    public static void main(String[] args) {
        showBike(new HelloBuilder());
        showBike(new MobikeBuilder());
    }


    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
