package me.ilcb.responsibility;

/**
 * Created by Jasper on 2016/5/13.
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
