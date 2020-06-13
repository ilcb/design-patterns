package me.ilcb.singleton.doubleheck;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance() {
        Singleton tInstance = instance;
        if (tInstance == null) {
            synchronized (Singleton.class) {
                tInstance = instance;
                if (tInstance == null) {
                    tInstance = new Singleton();
                    instance = tInstance;
                }
            }
        }
        return tInstance;
    }
}
