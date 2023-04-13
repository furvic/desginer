package com.mashibing.example03;

import java.io.Serializable;

/**
 * @author spikeCong
 * @date 2022/9/21
 **/
public class ConcretePrototype implements Cloneable, Serializable {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    void show(){
        System.out.println("嫌疑人姓名: " +person.getName());
    }

    public ConcretePrototype() {
        System.out.println("具体的原型对象创建完成!");
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("具体的原型对象复制成功!");
        return (ConcretePrototype)super.clone();
    }

}
