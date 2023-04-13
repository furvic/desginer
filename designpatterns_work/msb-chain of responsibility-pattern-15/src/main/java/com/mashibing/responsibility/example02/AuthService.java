package com.mashibing.responsibility.example02;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * @author spikeCong
 * @date 2022/10/14
 **/
public class AuthService {

    private static Map<String,Date> authMap = new HashMap<String, Date>();

    /**
     * 审核流程
     * @param uId    审核人id
     * @param orderId  审核单id
     */
    public static void auth(String uId, String orderId){
        System.out.println("审批人ID: "+uId);
        authMap.put(uId.concat(orderId),new Date());
    }

    //查询审核结果
    public static Date queryAuthInfo(String uId, String orderId){
        return authMap.get(uId.concat(orderId)); //key=审核人id+审核单子id
    }
}
