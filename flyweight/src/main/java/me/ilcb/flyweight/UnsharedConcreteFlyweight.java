package me.ilcb.flyweight;

/**
 * 具体非享元
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    public void operation(int externsicState){
        System.out.println("不共享的状态: " + externsicState);
    }
}
