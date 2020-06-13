package me.ilcb.responsibility.example;

/**
 */
public class GeneralManagerHandler extends Handler {
    public GeneralManagerHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void handleRequest(Request request) {
        System.out.println(handlerName + " was signed");
        if (request.getDay() > 3) {
            success(request);
        }
        if (this.handler instanceof Handler) {
            handler.handleRequest(request);
        }
    }
}
