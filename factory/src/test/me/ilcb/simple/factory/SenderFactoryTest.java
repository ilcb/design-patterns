package me.ilcb.simple.factory;

import org.junit.Test;

public class SenderFactoryTest {
    @Test
    public void test() {
        SenderFactory factory = new SenderFactory();
        ISender sender = factory.create("sms");
        sender.send();
    }
}