package me.ilcb.fecade.example;

/**
 */
public class Television {
    private boolean isOpen = false;

    public void on() {
        System.out.println("Television is open");
        this.isOpen = true;
    }

    public void off() {
        System.out.println("Television is off");
        this.isOpen = false;
    }
}
