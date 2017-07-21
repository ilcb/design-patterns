package me.ilcb.decorator;

/**
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体组件");
    }
}
