package com.mashibing.state.example03;

import com.mashibing.state.example03.TrafficLight;

/**
 * 红灯状态类
 * @author spikeCong
 * @date 2022/10/17
 **/
public class Red implements State {

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("红灯不能切换为绿灯!");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("黄灯亮起...时长:10秒!");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("已是红灯状态无须再切换!");
    }
}
