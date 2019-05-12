package me.ilcb.factory.method;

/**
 * 除法工厂
 */
public class DivisionOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Division();
    }
}
