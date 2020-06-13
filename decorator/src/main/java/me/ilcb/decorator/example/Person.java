package me.ilcb.decorator.example;

/**
 */
public abstract class Person {
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public abstract void show();
}
