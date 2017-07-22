package me.ilcb.command.example;

/**
 * 具体的命令实现对象：换频道
 */
public class ChangeCommand extends Command{
    private Receiver tv;
    private String state;

    public ChangeCommand(Receiver receiver) {
        this.tv = receiver;
    }

    public void execute() {
        tv.changeAction();
    }
}
