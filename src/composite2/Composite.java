package composite2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> list = new ArrayList<Component>();

    @Override
    public void dosth() {
        for (Component component : list) {
            component.dosth();
        }
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public List<Component> getAll() {
        return this.list;
    }
}
