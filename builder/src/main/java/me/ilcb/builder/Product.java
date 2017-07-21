package me.ilcb.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件组成
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("产品创建:");
        for (String part : parts){
            System.out.print(part + ",");
        }
        System.out.println();
    }
}
