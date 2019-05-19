package me.ilcb.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 */
public class ObjectStructure {
    private List<Element> collection;

    public ObjectStructure() {
        this.collection = new ArrayList<Element>();
    }

    public void attach(Element element) {
        collection.add(element);
    }

    public void detach(Element element) {
        collection.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element ele : collection) {
            ele.accept(visitor);
        }
    }
}
