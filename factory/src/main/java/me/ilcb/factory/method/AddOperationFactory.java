package me.ilcb.factory.method;

/**
 * 加法工厂
 */
public class AddOperationFactory implements IOperationFactory {
    public IOperation createOperation() {
        return new Add();
    }
}
