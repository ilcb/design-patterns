package me.ilcb.proxy;

/**
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实请求!");
    }
}
