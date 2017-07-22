package me.ilcb.mediator.example;

/**
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("Iraq have received message: " + message);
    }
}
