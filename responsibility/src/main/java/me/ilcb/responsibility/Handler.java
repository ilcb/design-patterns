package me.ilcb.responsibility;

/**
 * 定义处理请求的接口，并且实现后继链
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler handler){
        this.successor = handler;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public abstract void handlerRequest(int request);
}
