package me.ilcb.factory.method;

import org.junit.Assert;
import org.junit.Test;
import sun.plugin2.ipc.IPCFactory;

import static org.junit.Assert.*;

public class OperationFactoryTest {
    @Test
    public void test() {
        IOperationFactory factory = new AddOperationFactory();
        IOperation operation = factory.createOperation();
        double total = operation.calculate(1.0, 3.0);
        Assert.assertEquals(4.0, total, 0.0001);
    }
}