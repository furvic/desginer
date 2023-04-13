package com.mashibing.observer.example02;

import java.util.Date;

/**
 * @author spikeCong
 * @date 2022/10/11
 **/
public class LotteryResult {

    private String uId; // 用户id
    private String msg; // 摇号信息
    private Date dataTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dataTime) {
        this.uId = uId;
        this.msg = msg;
        this.dataTime = dataTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public String toString() {
        return "LotteryResult{" +
                "uId='" + uId + '\'' +
                ", msg='" + msg + '\'' +
                ", dataTime=" + dataTime +
                '}';
    }
}
