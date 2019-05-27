package me.ilcb.flyweight;

/**
 * 具体享元
 */
public class ConcreteFlyweight extends Flyweight {
    public void operation(int externsicState){
        System.out.println("状态: " + externsicState);
    }
}
