package me.ilcb.factory.method;

import org.junit.Assert;
import org.junit.Test;

public class OperationFactoryTest {
    @Test
    public void test() {
        IOperationFactory factory = new AddOperationFactory();
        IOperation operation = factory.createOperation();
        double total = operation.calculate(1.0, 3.0);
        System.out.println(total);
        Assert.assertEquals(4.0, total, 0.0001);
    }
}