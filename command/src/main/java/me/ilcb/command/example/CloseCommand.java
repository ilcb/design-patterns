package me.ilcb.command.example;

/**
 * 具体的命令实现对象：关闭
 */
public class CloseCommand extends Command {
    private Receiver tv;
    private String state;

    public CloseCommand(Receiver receiver) {
        this.tv = receiver;
    }

    public void execute() {
        tv.closeAction();
    }
}
