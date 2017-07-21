package me.ilcb.composite;

/**
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf cannot add!");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Leaf cannot remove!");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; ++i){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
