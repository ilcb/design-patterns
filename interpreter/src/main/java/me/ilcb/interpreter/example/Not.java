package me.ilcb.interpreter.example;

public class Not implements Expression {
    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Not) {
            return exp.equals(((Not) obj).exp);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    public String toString() {
        return "(Not " + exp.toString() + ")";
    }
}
