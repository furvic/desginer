package com.mashibing.example02;

/**
 * @author spikeCong
 * @date 2022/9/27
 **/
public class TestDecorator {

    public static void main(String[] args) {

        String info = "name:tom,age:15";
        DataLoaderDecorator decorator = new EncryptionDataDecorator(new BaseFileDataLoader("demo.txt"));
        decorator.write(info);

        String data = decorator.read();
        System.out.println(data);
    }
}
