package me.ilcb.proxy;

/**
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
