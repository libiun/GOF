package composite2;

import java.util.List;

public interface Component {

    public void dosth();

    public void add(Component component);

    public void remove(Component component);

    public List<Component> getAll();
}
