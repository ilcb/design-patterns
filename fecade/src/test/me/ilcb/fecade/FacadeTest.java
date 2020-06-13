package me.ilcb.fecade;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacadeTest {
    @Test
    public void test() {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}