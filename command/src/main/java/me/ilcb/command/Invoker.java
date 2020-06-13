package me.ilcb.command;

/**
 * 要求该命令执行这个操作
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
