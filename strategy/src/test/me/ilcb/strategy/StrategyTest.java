package me.ilcb.strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void test() {
        Context context = null;
        context = new Context(new ConcreteStrategyA());
        context.action();

        context =  new Context(new ConcreteStrategyB());
        context.action();
    }
}