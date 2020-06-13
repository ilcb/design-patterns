package me.ilcb.responsibility.example;

/**
 * 具体处理者角色(ConcreteHandler:President):处理它所负责的请求，可以访问后继者，如果可以处理请求则处理，否则将该请求转给他的后继者。
 */
public class LeaderHandler extends Handler {
    public LeaderHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void handleRequest(Request request) {
        System.out.println(handlerName + " was known");
        if (request.getDay() < 0.5) {
            success(request);
        }
        if (handler instanceof Handler) {
            handler.handleRequest(request);
        }
    }
}
