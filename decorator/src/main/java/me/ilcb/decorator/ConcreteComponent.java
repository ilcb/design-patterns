package me.ilcb.decorator;

/**
 * 具体组件，被装饰者实例
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体组件");
    }
}
