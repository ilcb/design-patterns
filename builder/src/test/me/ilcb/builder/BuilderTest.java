package me.ilcb.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test() {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        Director director = new Director();
        director.construct(concreteBuilder1);
        Product product = concreteBuilder1.getResult();
        product.show();

        director.construct(concreteBuilder2);
        product = concreteBuilder2.getResult();
        product.show();
    }
}