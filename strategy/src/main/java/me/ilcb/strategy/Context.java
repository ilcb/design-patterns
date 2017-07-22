package me.ilcb.strategy;

/**
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void tellStrategy(){
        strategy.tellStrategy();
    }
}
