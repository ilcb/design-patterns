package me.ilcb.responsibility.example;

/**
 */
public class ManagerHandler extends Handler {
    public ManagerHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void handleRequest(Request request) {
        System.out.println(this.handlerName + " was signed");
        if (request.getDay() > 0.5 && request.getDay() <= 3) {
            success(request);
        }
        if (handler instanceof Handler) {
            handler.handleRequest(request);
        }
    }
}
