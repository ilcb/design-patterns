package me.ilcb.command.example;

/**
 * 接收者对象
 */
public class Receiver {

    /**
     * 真正执行命令相应的打开操作
     */
    public void openAction() {
        System.out.println("open Action");
    }

    /**
     * 真正执行命令相应的关闭操作
     */
    public void closeAction() {
        System.out.println("close Action");
    }

    /**
     * 真正执行命令相应的换频道操作
     */
    public void changeAction() {
        System.out.println("change Action");
    }
}
