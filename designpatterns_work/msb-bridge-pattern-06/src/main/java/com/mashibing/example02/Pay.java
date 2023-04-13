package com.mashibing.example02;

import java.math.BigDecimal;

/**
 * 支付抽象类(抽象化角色)
 * @author spikeCong
 * @date 2022/9/26
 **/
public abstract class Pay {

    //桥接对象
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    //划账功能
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
