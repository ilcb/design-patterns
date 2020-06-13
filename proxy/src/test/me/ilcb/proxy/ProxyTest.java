package me.ilcb.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {
    @Test
    public void test() {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}