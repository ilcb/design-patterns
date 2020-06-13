package me.ilcb.fecade.example;

import org.junit.Test;

public class SwitchFacadeTest {
    @Test
    public void test() {
        SwitchFacade switchFacade = new SwitchFacade();
        switchFacade.dayMethod(true);
        System.out.println("==========================");
        switchFacade.nightMethod(true);
    }
}
