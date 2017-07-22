package me.ilcb.state;

import org.junit.Test;

public class StateTest {
    @Test
    public void test() {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }

}