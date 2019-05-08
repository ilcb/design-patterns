package me.ilcb.observer;

/**
 * 具体主题/通知者，将有关状态存入具体观察者对象，在具体主题内部状态发生改变时，给所有登记过的观察者发出通知
 */
public class ConcreteSubject extends Subject{
    //具体被观察者状态
    public String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
