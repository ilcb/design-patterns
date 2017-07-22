package me.ilcb.template.example;

import org.junit.Test;

public class TemplateTest {
    @Test
    public void test() {
        AbstractBank clientele = new ConcreteDeposit();
        clientele.templateMethodProcess();

        clientele = new ConcreteTransfer();
        clientele.templateMethodProcess();

        clientele = new ConcreteWithdraw();
        clientele.templateMethodProcess();
    }
}
