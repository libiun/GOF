package composite2;

import java.util.List;

public class Leaf implements IComponent {

    @Override
    public void dosth() {
        System.out.println("执行操作");
    }

    @Override
    public void add(IComponent component) {
    }

    @Override
    public void remove(IComponent component) {
    }

    @Override
    public List<IComponent> getAll() {
        return null;
    }
}
