package me.ilcb.simple.factory;

public class MailSender implements ISender {
    public void send() {
        System.out.println("this is a MailSender");
    }
}
