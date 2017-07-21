package me.ilcb.fecade.example;

/**
 * 外观模式
 */
public class SwitchFacade {
    private Light light;//电灯
    private AirConditioner airConditioner;//空调
    private Fan fan;//电扇
    private Television television;//电视

    public SwitchFacade() {
        this.light = new Light();
        this.fan = new Fan();
        this.airConditioner = new AirConditioner();
        this.television = new Television();
    }

    /**
     * 晚上开电灯
     */
    public void nightMethod(boolean isOpen) {
        if (isOpen) {
            this.light.on();
            this.fan.on();
            this.airConditioner.on();
            this.television.on();
        } else {
            this.light.off();
            this.fan.off();
            this.airConditioner.off();
            this.television.off();
        }

    }

    /**
     * 白天不需要电灯
     */
    public void dayMethod(boolean isOpen) {
        if (isOpen) {
            this.fan.on();
            this.airConditioner.on();
            this.television.on();
        } else {
            this.fan.off();
            this.airConditioner.off();
            this.television.off();
        }
    }
}
