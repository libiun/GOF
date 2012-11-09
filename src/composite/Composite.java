package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> list = new ArrayList<Component>();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public List<Component> getAll() {
        return this.list;
    }

    @Override
    public void dosth() {
        for (Component component : list) {
            component.dosth();
        }
    }
}
