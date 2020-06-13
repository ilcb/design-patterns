package me.ilcb.command.example;


/**
 * 具体的命令实现对象:打开命令
 */
public class OpenCommand extends Command{
    private Receiver tv; //持有相应的接收者对象
    private String state; //示意，命令对象可以有自己的状态

    public OpenCommand(Receiver receiver) {
        this.tv = receiver;
    }

    public void execute() {
        tv.openAction();
    }
}
