package me.ilcb.template.example;

/**
 * 具体子类:存款
 */
public class ConcreteDeposit extends AbstractBank {
    @Override
    protected void transact() {
        System.out.print("办理:Deposit\n");
    }
}
