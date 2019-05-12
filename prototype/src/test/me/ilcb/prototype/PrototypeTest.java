package me.ilcb.prototype;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void test() {
        Prototype p1 = new ConcretePrototype1("aaa");
        //获取原型来创建对象
        Prototype clonedP1 = p1.clone();
        System.out.println("clonedP1：" + clonedP1);

        //有人动态的切换了实现
        Prototype p2 = new ConcretePrototype2("bbb");
        Prototype clonedP2 = p2.clone();
        System.out.println("clonedP2：" + clonedP2);
    }
}