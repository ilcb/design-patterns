package me.ilcb.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}