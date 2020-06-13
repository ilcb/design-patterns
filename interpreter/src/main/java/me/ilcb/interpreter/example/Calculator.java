package me.ilcb.interpreter.example;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 计算器
 */
public class Calculator {
    // 中缀表达式
    private String expressions;
    // 操作数栈
    private LinkedList<Character> operStack = new LinkedList<>();
    // 后缀表达式计算数据栈
    private Stack<Expression> numStack = new Stack<>();


    public String getExpressions() {
        return expressions;
    }

    public void setExpressions(String expressions) {
        this.expressions = expressions;
    }

    private String transferPostfix() {
        StringBuilder result = new StringBuilder();
        for (char ele : expressions.toCharArray()) {
            switch (ele) {
                case '(':
                    // 左括号直接入栈
                    operStack.push(ele);
                    break;
                case '+':
                case '-':
                    // 碰到'+'，'-'，将栈中所有运算符弹出，直至碰到左括号为止，输出到队列中去
                    while(!operStack.isEmpty()) {
                        char top = operStack.pop();
                        if (top == '(') {
                            operStack.push(top);
                            break;
                        }
                        result.append(top);
                    }
                    // 没有进入循环说明是当前为第一次进入或者其他前面运算都有括号等情况导致栈已经为空,此时需要将符号进栈
                    operStack.push(ele);
                    break;
                case '*':
                case '/':
                    // 如果是乘号或者除号，则弹出所有序列，直到碰到加好、减号、左括号为止，最后将该操作符压入堆栈
                    while(!operStack.isEmpty()) {
                        char top = operStack.pop();

                        // 只有比当前优先级高的或者相等的才会弹出到输出队列，遇到加减左括号，直接停止当前循环
                        if (top == '+' || top == '-' || top == '(') {
                            operStack.push(top);
                            break;
                        } else {
                            result.append(top);
                        }
                    }
                    // 没有进入循环说明是当前为第一次进入或者其他前面运算都有括号等情况导致栈已经为空,此时需要将符号进栈
                    operStack.push(ele);
                    break;
                case ')':
                    // 如果碰到的是右括号，则距离栈顶的第一个左括号上面的所有运算符弹出栈并抛弃左括号
                    while(!operStack.isEmpty()) {
                        char top = operStack.pop();
                        if (top == '(') {
                            break;
                        } else {
                            result.append(top);
                        }
                    }
                    break;
                default:
                        result.append(ele);
            }
        }
        while (!operStack.isEmpty()) {
            result.append(operStack.pop());
        }
        System.out.println("后缀： "+ result);
        return result.toString();
    }

    /**
     * 中缀转后缀
     * 1.遇到操作数：添加到后缀表达式中或直接输出
     * 2.栈空时：遇到运算符，直接入栈
     * 3.遇到左括号：将其入栈
     * 4.遇到右括号：执行出栈操作，输出到后缀表达式，直到弹出的是左括号(注意：左括号不输出到后缀表达式)
     * 5.遇到其他运算符：弹出所有优先级大于或等于该运算符的栈顶元素，然后将该运算符入栈
     * 6.将栈中剩余内容依次弹出后缀表达式
     */
    public String transfer() {
        String result = "";
        for (char ele : expressions.toCharArray()) {
            // 数字直接入栈
            if (Character.isDigit(ele)) {
                result += ele;
                continue;
            }

            if (ele == '(') {
                // 3.遇到左括号：将其入栈
                operStack.push(ele);
            } else if (ele == ')') {
                // 4.遇到右括号：执行出栈操作，输出到后缀表达式，直到弹出的是左括号(注意：左括号不输出到后缀表达式)
                while (!operStack.isEmpty() && operStack.peek() != '(') {
                    result += operStack.pop();
                }

                // 弹出左括号
                operStack.pop();
            } else {
                //5.遇到其他运算符：弹出所有优先级大于或等于该运算符的栈顶元素，然后将该运算符入栈
                while (!operStack.isEmpty() && priority(operStack.peek()) >= priority(ele) && operStack.peek() != '(') {
                    result += operStack.pop();
                }
                operStack.push(ele);
            }
        }

        //6.将栈中剩余内容依次弹出后缀表达式
        while (!operStack.isEmpty()) {
            result += operStack.poll();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String str = "3+(2-5)*6/3";
        calculator.setExpressions(str);

        System.out.println(calculator.transfer());

        str = "5+2*(3*(3-1*2+1))";
        calculator.setExpressions(str);
        System.out.println(calculator.transfer());
    }

    private int priority(char oper) {
        switch (oper) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
            case ')':
                return 3;
            default:
                return 0;
        }
    }

    /**
     * 后缀表达式的计算
     * 从左到右扫描后缀表达式
     * 1.若是操作数，就压栈，
     * 2.若是操作符，就连续弹出两个操作数计算，计算结果压栈
     * 3.栈顶的值即为所需结果
     * 注：先弹出的是第一操作数，后弹出的是第二操作数
     */
    public int calculate() {
        Expression leftExpression = null;
        Expression rightExpression = null;
        char[] array = transferPostfix().toCharArray();
        for (int i = 0, length = array.length; i < length; ++i) {
            switch (array[i]) {
                case '+':
                    rightExpression = numStack.pop();
                    leftExpression = numStack.pop();
                    numStack.push(new AddExpression(leftExpression, rightExpression));
                    break;
                case '-':
                    rightExpression = numStack.pop();
                    leftExpression = numStack.pop();
                    numStack.push(new SubExpression(leftExpression, rightExpression));
                    break;
                case '*':
                    rightExpression = numStack.pop();
                    leftExpression = numStack.pop();
                    numStack.push(new MultipleExpression(leftExpression, rightExpression));
                    break;
                case '/':
                    rightExpression = numStack.pop();
                    leftExpression = numStack.pop();
                    numStack.push(new DivideExpression(leftExpression, rightExpression));
                    break;
                default:
                    numStack.push(new NumExpression(Integer.valueOf("" + array[i])));
            }
        }
        return numStack.pop().interpret();
    }


}
