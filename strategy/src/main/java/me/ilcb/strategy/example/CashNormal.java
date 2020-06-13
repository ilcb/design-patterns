package me.ilcb.strategy.example;

/**
 */
public class CashNormal implements CashSuper {
    public double acceptCash(double money) {
        return money;
    }
}
