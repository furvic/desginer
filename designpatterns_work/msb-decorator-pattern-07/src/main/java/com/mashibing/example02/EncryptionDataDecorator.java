package com.mashibing.example02;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 具体装饰者-对文件内容进行加密和解密
 * @author spikeCong
 * @date 2022/9/27
 **/
public class EncryptionDataDecorator extends DataLoaderDecorator {

    public EncryptionDataDecorator(DataLoader wrapper) {
        super(wrapper);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }


    //加密操作
    private String encode(String data) {
        try {
             Base64.Encoder encoder = Base64.getEncoder();
             byte[] bytes = data.getBytes("UTF-8");
             String result = encoder.encodeToString(bytes);

             return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //解密
    private String decode(String data) {

        try {
            Base64.Decoder decoder = Base64.getDecoder();
            String result = new String(decoder.decode(data), "UTF-8");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
