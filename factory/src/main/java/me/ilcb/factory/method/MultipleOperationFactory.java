package me.ilcb.factory.method;

/**
 * 乘法工厂
 */
public class MultipleOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Multiple();
    }
}
