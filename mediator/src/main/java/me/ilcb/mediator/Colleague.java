package me.ilcb.mediator;

/**
 * 抽象同事类
 */
public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
