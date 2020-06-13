package me.ilcb.strategy;

/**
 * Context
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void action(){
        strategy.behavior();
    }
}
