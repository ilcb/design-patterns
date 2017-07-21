package me.ilcb.flyweight;

/**
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    public void operation(int externsicState){
        System.out.println("不共享的状态: " + externsicState);
    }
}
