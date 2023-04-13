package com.mashibing.example03;

import com.mashibing.example02.Receipt;

/**
 * @author spikeCong
 * @date 2022/10/13
 **/
public class Mt1011ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1011: " + receipt.getMessage());
    }
}
