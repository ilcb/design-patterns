package me.ilcb.mediator.example;

/**
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }
}
