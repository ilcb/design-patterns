package me.ilcb.factory.method;

public class MultipleOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Multiple();
    }
}
