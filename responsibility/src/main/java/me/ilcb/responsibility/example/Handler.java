package me.ilcb.responsibility.example;

/**
 * 抽象处理者角色(Handler:Approver):定义一个处理请求的接口，和一个后继连接(可选)
 */
public abstract class Handler {
    protected Handler handler;
    protected String handlerName;

    public void setSuccessor(Handler handler) {
        this.handler = handler;
    }

    protected boolean success(Request request) {
        System.out.println(request.getName() + " request was passed!");
        return true;
    }

    public abstract void handleRequest(Request request);
}
