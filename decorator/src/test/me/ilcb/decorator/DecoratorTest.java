package me.ilcb.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {
    @Test
    public void test() {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}