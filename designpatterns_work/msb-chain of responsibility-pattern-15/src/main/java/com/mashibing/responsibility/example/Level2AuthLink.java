package com.mashibing.responsibility.example;



import com.mashibing.responsibility.example02.AuthService;
import com.mashibing.responsibility.example02.AuthInfo;
import java.text.ParseException;
import java.util.Date;

/**
 * 二级负责人
 */
public class Level2AuthLink extends AuthLink {

    private Date beginDate = f.parse("2020-11-11 00:00:00");
    private Date endDate = f.parse("2020-11-31 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.getNext();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate) ) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }

}
