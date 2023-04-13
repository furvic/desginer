package com.mashibing.responsibility.example03;

import com.mashibing.responsibility.example02.AuthInfo;
import com.mashibing.responsibility.example02.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/14
 **/
public class Level1AuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2020-11-11 00:00:00");
    private Date endDate = sdf.parse("2020-11-20 23:59:59");

    public Level1AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {

        //查询审批流程信息
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);

        if(null == date){
            return new AuthInfo("0001","单号: " + orderId,"状态: 待一级审批负责人 ",levelUserName);
        }

        AuthLink next = super.next();
        if (null == next){
            return new AuthInfo("0000","单号:",orderId,
                    " 状态: 一级审批完成","时间: " + sdf.format(date),"审批人: " + levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：一级审批负责人完成", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }
        return next.doAuth(uId,orderId,authDate);
    }
}
