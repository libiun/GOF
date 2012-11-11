package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private List<IComponent> list = new ArrayList<IComponent>();

    public void add(IComponent component) {
        list.add(component);
    }

    public void remove(IComponent component) {
        list.remove(component);
    }

    public List<IComponent> getAll() {
        return this.list;
    }

    @Override
    public void dosth() {
        for (IComponent component : list) {
            component.dosth();
        }
    }
}
