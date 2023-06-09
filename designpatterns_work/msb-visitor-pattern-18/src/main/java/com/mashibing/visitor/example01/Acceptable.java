package com.mashibing.visitor.example01;

/**
 * 接待者接口(抽象元素角色)
 * @author spikeCong
 * @date 2022/10/18
 **/
public interface Acceptable {

    //接收所有的Visitor访问者的子类实现类
    public void accept(Visitor visitor);
}
