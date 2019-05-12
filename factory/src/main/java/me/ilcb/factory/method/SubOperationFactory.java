package me.ilcb.factory.method;

/**
 * 减法工厂
 */
public class SubOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Sub();
    }
}
