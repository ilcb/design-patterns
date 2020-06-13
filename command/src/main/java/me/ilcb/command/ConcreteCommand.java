package me.ilcb.command;

/**
 * 具体命令
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
