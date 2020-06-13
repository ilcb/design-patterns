package me.ilcb.proxy;

/**
 * 定义了RealSubject和Proxy共同的接口，在任何使用RealSubject的地方都可以使用代理
 */
public abstract class Subject {
    public abstract void request();
}
