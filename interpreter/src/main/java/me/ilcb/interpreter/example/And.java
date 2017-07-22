package me.ilcb.interpreter.example;

public class And implements Expression {
    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof And) {
            return left.equals(((And) obj).left) &&
                    right.equals(((And) obj).right);
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean interpret(Context ctx) {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
