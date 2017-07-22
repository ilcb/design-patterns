package me.ilcb.state.example;

import org.junit.Test;

public class StateTest {
    @Test
    public void test() {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}