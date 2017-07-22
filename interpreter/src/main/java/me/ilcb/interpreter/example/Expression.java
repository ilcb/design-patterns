package me.ilcb.interpreter.example;

public interface Expression {
    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     */
    boolean interpret(Context ctx);

    /**
     * 检验两个表达式在结构上是否相同
     */
    boolean equals(Object obj);

    /**
     * 返回表达式的hash code
     */
    int hashCode();

    /**
     * 将表达式转换成字符串
     */
    String toString();
}
