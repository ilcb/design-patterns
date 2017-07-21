package me.ilcb.factory.method;

public class AddOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Add();
    }
}
