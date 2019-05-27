package me.ilcb.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class WebsiteFactory {
    private Map<String, Website> websiteMap = new HashMap<String, Website>();

    public Website getWebsite(String key){
        if (!websiteMap.containsKey(key)){
            websiteMap.put(key, new ConcreteWebsite(key));
        }

        return websiteMap.get(key);
    }

    public int getWebsiteCount(){
        return websiteMap.size();
    }
}
