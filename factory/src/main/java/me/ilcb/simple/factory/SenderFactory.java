package me.ilcb.simple.factory;

public class SenderFactory {
    public ISender create(String type) {
        ISender sender = null;
        if (type.equals("sms")) {
            sender = new SmsSender();
        } else if ("mail".equals(type)) {
            sender = new MailSender();
        }
        return sender;
    }
}
