package me.ilcb.adapter.clazz;

public class Client {
    public static void main(String[] args){
        Target target = new Adapter();
        target.request();
    }
}
