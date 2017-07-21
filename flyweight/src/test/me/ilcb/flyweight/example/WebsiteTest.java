package me.ilcb.flyweight.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebsiteTest {
    @Test
    public void test() {
        WebsiteFactory factory = new WebsiteFactory();
        Website website1 = new ConcreteWebsite("产品展示");
        website1.use(new User("A"));

        Website website2 = new ConcreteWebsite("博客");
        website2.use(new User("B"));
    }
}