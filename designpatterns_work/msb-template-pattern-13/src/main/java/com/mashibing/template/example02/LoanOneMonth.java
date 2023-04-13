package com.mashibing.template.example02;

/**
 * 借款一个月
 * @author spikeCong
 * @date 2022/10/12
 **/
public class LoanOneMonth extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期30天,利率为10%!");
    }
}
