package me.ilcb.decorator;

/**
 * 装饰者父类
 */
public class Decorator extends Component {
    private Component component;

    public void setComponent(Component compontent){
        this.component = compontent;
    }

    @Override
    public void operation() {
        if (component != null){
            component.operation();
        }
    }
}
