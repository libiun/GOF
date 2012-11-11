package Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//具体策略一
public class DownPersonWithNameStrategy implements ISortPersonStrategy, Comparator<Person> {

    @Override
    public void sort(List<Person> list) {
        Collections.sort(list, this);
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = o2.getName().compareToIgnoreCase(o1.getName());
        if (0 == result) {
            return o1.getId() - o2.getId();
        }
        return result;
    }
}
