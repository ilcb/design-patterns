package me.ilcb.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    private Map<String, Flyweight> factory = new HashMap<String, Flyweight>();

    public FlyweightFactory(){
        factory.put("X", new ConcreteFlyweight());
        factory.put("Y", new ConcreteFlyweight());
        factory.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return factory.get(key);
    }
}
