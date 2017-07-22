package me.ilcb.interpreter.example;

public class Constants implements Expression {
    private boolean value;

    public Constants(boolean value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Constants) {
            return this.value == ((Constants) obj).value;
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean interpret(Context ctx) {
        return value;
    }

    public String toString() {
        return new Boolean(value).toString();
    }

}
