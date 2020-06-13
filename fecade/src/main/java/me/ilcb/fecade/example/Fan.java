package me.ilcb.fecade.example;

/**
 */
public class Fan {
    private boolean isOpen = false;

    public void on() {
        System.out.println("Fan is open");
        this.isOpen = true;
    }

    public void off() {
        System.out.println("Fan is off");
        this.isOpen = false;
    }
}
