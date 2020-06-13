package me.ilcb.proxy.example;

import org.junit.Test;

/**
 */
public class ProxyTest {
    @Test
    public void test() {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("A");

        Proxy proxy = new Proxy(girl);
        proxy.sendChocolate();
        proxy.sendFlowers();
    }
}
