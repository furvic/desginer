package com.mashibing.example02;

/**
 * 抽象的文件读取接口DataLoader
 * @author spikeCong
 * @date 2022/9/27
 **/
public interface DataLoader {

    String read();

    void write(String data);
}
