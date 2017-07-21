package me.ilcb.factory.method;

public class DivisionOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Division();
    }
}
