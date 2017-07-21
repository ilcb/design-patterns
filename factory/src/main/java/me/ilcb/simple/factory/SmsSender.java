package me.ilcb.simple.factory;

public class SmsSender implements ISender {
    public void send() {
        System.out.println("this is a SmsSender");
    }
}
