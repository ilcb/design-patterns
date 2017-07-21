package me.ilcb.flyweight;

/**
 * 所有具体享元类的父类或接口，通过这个接口，享元类可以接受并作用于外部状态
 */
public abstract class Flyweight {
    public abstract void operation(int externsicState);
}
