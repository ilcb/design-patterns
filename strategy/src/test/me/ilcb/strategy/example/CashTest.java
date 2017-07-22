package me.ilcb.strategy.example;

import org.junit.Test;

public class CashTest {
    @Test
    public void test() {
        CashContext context = new CashContext("正常收费");
        System.out.println(context.acceptResult(100));

        context = new CashContext("打折");
        System.out.println(context.acceptResult(100));

        context = new CashContext("满300返100");
        System.out.println(context.acceptResult(400));
    }
}