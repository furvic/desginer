package com.mashibing.adapter.example01;

/**
 * 电脑类
 * @author spikeCong
 * @date 2022/9/28
 **/
public class Computer {

    public String read(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card is null");
        }

        return  sdCard.readSD();
    }

}
