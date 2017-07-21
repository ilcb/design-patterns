package me.ilcb.flyweight;

/**
 */
public class ConcreteFlyweight extends Flyweight {
    public void operation(int externsicState){
        System.out.println("状态: " + externsicState);
    }
}
