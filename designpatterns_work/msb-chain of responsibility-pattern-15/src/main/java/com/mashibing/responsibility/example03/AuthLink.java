package com.mashibing.responsibility.example03;

import com.mashibing.responsibility.example02.AuthInfo;
import com.mashibing.responsibility.example02.AuthService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 责任链审核抽象类
 * @author spikeCong
 * @date 2022/10/14
 **/
public abstract class AuthLink {

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式化

    protected String levelUserId; //审核人id

    protected String levelUserName; //审核人姓名

    //保存对下一个处理者的引用
    protected AuthLink next;

    public AuthLink next() {
        return next;
    }

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    //抽象审核方法,不同级别处理不同的审核业务
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
