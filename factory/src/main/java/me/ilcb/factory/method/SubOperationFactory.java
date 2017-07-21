package me.ilcb.factory.method;

public class SubOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Sub();
    }
}
