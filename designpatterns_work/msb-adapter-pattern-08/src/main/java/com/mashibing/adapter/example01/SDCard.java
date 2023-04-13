package com.mashibing.adapter.example01;

/**
 * SD卡接口
 * @author spikeCong
 * @date 2022/9/28
 **/
public interface SDCard {

    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}
