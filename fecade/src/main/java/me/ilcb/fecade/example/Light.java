package me.ilcb.fecade.example;

/**
 */
public class Light {
    private boolean isOpen = false;

    public void on() {
        System.out.println("Light is open");
        this.isOpen = true;
    }

    public void off() {
        System.out.println("Light is off");
        this.isOpen = false;
    }
}
