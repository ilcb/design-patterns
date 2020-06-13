package me.ilcb.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者Invoker:遥控器
 */
public class Invoker {
    private List<Command> commands = new ArrayList<Command>();

    /**
     * 设置调用者持有的命令对象
     *
     * @param command 命令对象
     */
    public void addCommand(Command command) {
        commands.add(command);
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void executeCommand() {
        //调用命令对象的执行方法
        for (Command command : commands) {
            command.execute();
        }
    }
}
