package me.ilcb.template.example;

/**
 */
public abstract class AbstractBank {
    private static int number = 0;

    /**
    * 模板方法
    * 因为子类不能覆写一个被定义为final的方法。从而保证了子类的逻辑永远由父类所控制。
    */
    public final void templateMethodProcess() {
        takeNumber();
        transact();
        if (isEvaluateHook()) {
            evaluateHook();
        }
    }

    /**
    * 基本方法—具体方法
    * 取号
    */
    private Integer takeNumber() {
        System.out.print("第" + (++number) + "位客户:");
        return number;
    }

    /**
    * 基本方法—抽象方法
    */
    protected abstract void transact();

    /**
    * 基本方法—钩子方法
    */
    protected void evaluateHook() {
        System.out.println("evaluateHook");
    }

    /**
    * 基本方法—钩子方法
    */
    protected boolean isEvaluateHook() {
        return true;
    }
}
