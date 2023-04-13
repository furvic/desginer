package com.mashibing.state.example03;

/**
 * @author spikeCong
 * @date 2022/10/17
 **/
public class Client {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToRed();
    }
}
