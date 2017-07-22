package me.ilcb.interpreter.example;

public class Or implements Expression {
    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Or) {
            return this.left.equals(((Or) obj).left) && this.right.equals(((Or) obj).right);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
