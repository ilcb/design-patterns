package me.ilcb.flyweight.example;

/**
 * 具体享元
 */
public class ConcreteWebsite extends Website{
    private String name;

    public ConcreteWebsite(String name){
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("对象地址: " + System.identityHashCode(this));
        System.out.println("网站分类:" + name + ", 用户: " + user.getName());
    }
}
