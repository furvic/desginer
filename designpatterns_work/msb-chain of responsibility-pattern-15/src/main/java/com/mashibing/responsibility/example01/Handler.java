package com.mashibing.responsibility.example01;

/**
 * 抽象处理者类
 * @author spikeCong
 * @date 2022/10/14
 **/
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handle(RequestData requestData);
}
