package me.ilcb.command.example;

/**
 * The Command abstraction(命令接口，声明执行的操作).
 */
public abstract class Command {
    /**
     *执行命令对应的操作
     */
    public abstract void execute();
}
