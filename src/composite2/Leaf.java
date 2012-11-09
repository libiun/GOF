package composite2;

import java.util.List;

public class Leaf implements Component {

    @Override
    public void dosth() {
        System.out.println("执行操作");
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public List<Component> getAll() {
        return null;
    }
}
