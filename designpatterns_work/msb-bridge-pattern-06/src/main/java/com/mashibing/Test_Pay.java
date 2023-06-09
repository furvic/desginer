package com.mashibing;

import com.mashibing.example01.PayController;
import com.mashibing.example02.*;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author spikeCong
 * @date 2022/9/26
 **/
public class Test_Pay {

    @Test
    public void test01() {

        PayController payController = new PayController();
        System.out.println("测试: 微信支付、人脸支付方式");
        payController.doPay("weixin_001","1000112333333",new BigDecimal(100),1,2);

        System.out.println("\n测试: 支付宝支付、指纹支付方式");
        payController.doPay("hifubao_002","1000112334567",new BigDecimal(100),2,3);

    }

    @Test
    public void test02() {
        System.out.println("测试场景1: 微信支付、人脸方式.");
        Pay wxpay = new WxPay(new PayFaceMode());
        wxpay.transfer("wx_00100100","10001900",new BigDecimal(100));

        System.out.println();

        System.out.println("测试场景2: 支付宝支付、指纹方式");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu1234567","567689999999",new BigDecimal(200));
    }
}
