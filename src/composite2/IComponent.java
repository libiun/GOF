package composite2;

import java.util.List;

public interface IComponent {

    public void dosth();

    public void add(IComponent component);

    public void remove(IComponent component);

    public List<IComponent> getAll();
}
