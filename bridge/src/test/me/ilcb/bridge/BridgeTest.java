package me.ilcb.bridge;

import org.junit.Test;

public class BridgeTest {
    @Test
    public void test() {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
