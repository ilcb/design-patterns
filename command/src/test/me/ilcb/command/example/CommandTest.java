package me.ilcb.command.example;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        OpenCommand openCommand = new OpenCommand(receiver);
        invoker.addCommand(openCommand);

        ChangeCommand changeCommand = new ChangeCommand(receiver);
        invoker.addCommand(changeCommand);

        CloseCommand closeCommand = new CloseCommand(receiver);
        invoker.addCommand(closeCommand);

        invoker.executeCommand();
    }
}