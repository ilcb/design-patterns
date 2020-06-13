package me.ilcb.template.example;

/**
 * 具体子类:转账
 */
public class ConcreteTransfer extends AbstractBank {
    @Override
    protected void transact() {
        System.out.print("办理:Transfer\n");
    }
}
