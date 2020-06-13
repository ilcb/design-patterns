package me.ilcb.strategy.example;

/**
 */
public class CashReturn implements CashSuper {
    public double moneyCondition;
    public double returnMonty;

    public CashReturn(double moneyCondition, double returnMonty){
        this.moneyCondition = moneyCondition;
        this.returnMonty = returnMonty;
    }

    public double acceptCash(double money) {
        if (money > moneyCondition){
            return money - Math.floor(money / moneyCondition) * returnMonty;
        }
        return money;
    }
}
