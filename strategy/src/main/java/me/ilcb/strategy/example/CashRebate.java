package me.ilcb.strategy.example;

/**
 */
public class CashRebate implements CashSuper {
    private double discountRate = 1.0;

    public CashRebate(double discountRate){
        this.discountRate = discountRate;
    }

    public double acceptCash(double money) {
        return money * discountRate;
    }
}
