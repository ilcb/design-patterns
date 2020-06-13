package me.ilcb.flyweight.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebsiteTest {
    @Test
    public void test() {
        WebsiteFactory factory = new WebsiteFactory();
        Website website1 = factory.getWebsite("Blog");
        website1.use(new User("A"));

        Website website2 = factory.getWebsite("Blog");
        website2.use(new User("B"));
    }
}