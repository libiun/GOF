package Strategy;

import java.util.List;

//抽象策略接口
public interface ISortPersonStrategy {

    public void sort(List<Person> list);
}
