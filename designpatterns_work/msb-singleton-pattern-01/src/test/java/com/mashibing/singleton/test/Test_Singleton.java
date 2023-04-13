package com.mashibing.singleton.test;

import com.mashibing.singleton.demo02.Singleton_02;
import com.mashibing.singleton.demo06.Singleton_06;
import org.junit.Test;

/**
 * 测试
 * @author spikeCong
 * @date 2022/9/5
 **/
public class Test_Singleton {

    @Test
    public void test1() {

        Singleton_06 instance = Singleton_06.INSTANCE;
    }



}
