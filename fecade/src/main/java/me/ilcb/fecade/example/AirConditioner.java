package me.ilcb.fecade.example;

/**
 */
public class AirConditioner {
    private boolean isOpen = false;

    public void on() {
        System.out.println("AirConditioner is open");
        this.isOpen = true;
    }

    public void off() {
        System.out.println("AirConditioner is off");
        this.isOpen = false;
    }
}
