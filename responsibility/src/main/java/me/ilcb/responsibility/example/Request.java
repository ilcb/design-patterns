package me.ilcb.responsibility.example;

/**
 * 请假申请
 */
public class Request {
    private String name;
    private float day;
    private String reason;

    public Request(String name, float day, String reason) {
        this.name = name;
        this.day = day;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDay() {
        return day;
    }

    public void setDay(float day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
