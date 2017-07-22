package me.ilcb.interpreter.example;

public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return name;
    }

    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }
}
