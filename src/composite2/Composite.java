package composite2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private List<IComponent> list = new ArrayList<IComponent>();

    @Override
    public void dosth() {
        for (IComponent component : list) {
            component.dosth();
        }
    }

    @Override
    public void add(IComponent component) {
        list.add(component);
    }

    @Override
    public void remove(IComponent component) {
        list.remove(component);
    }

    @Override
    public List<IComponent> getAll() {
        return this.list;
    }
}
