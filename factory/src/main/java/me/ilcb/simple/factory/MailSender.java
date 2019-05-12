package me.ilcb.simple.factory;

/**
 * 具体产品角色
 */
public class MailSender implements ISender {
    public void send() {
        System.out.println("this is a MailSender");
    }
}
