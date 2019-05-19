package me.ilcb.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemplateTest {
    @Test
    public void test() {
        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}