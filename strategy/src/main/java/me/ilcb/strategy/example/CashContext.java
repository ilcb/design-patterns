package me.ilcb.strategy.example;

/**
 */
public class CashContext {
    public CashSuper cashSuper = null;

    public CashContext(String strategy){
       if (strategy.equals("正常收费")){
           cashSuper = new CashNormal();
       } else if (strategy.equals("打折")){
           cashSuper = new CashRebate(0.8);
       } else if (strategy.equals("满300返100")){
           cashSuper = new CashReturn(300, 100);
       }
    }

    public double acceptResult(double money){
        return cashSuper.acceptCash(money);
    }
}
