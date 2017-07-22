package me.ilcb.template.example;

/**
 * 具体子类:取款
 */
public class ConcreteWithdraw extends AbstractBank {
    @Override
    protected void transact() {
        System.out.print("办理:Withdraw\n");
    }
}
