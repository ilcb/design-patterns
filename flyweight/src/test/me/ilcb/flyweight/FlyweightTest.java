package me.ilcb.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyweightTest {
    @Test
    public void test() {
        int externsicState = 10;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("X");
        flyweight1.operation(--externsicState);

        Flyweight flyweight2 = factory.getFlyweight("Y");
        flyweight2.operation(--externsicState);;

        Flyweight flyweight3 = factory.getFlyweight("Z");
        flyweight3.operation(--externsicState);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(--externsicState);
    }

}