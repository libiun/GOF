package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//具体策略二
public class UpPersonWithNameStrategy implements ISortPersonStrategy, Comparator<Person> {

    @Override
    public void sort(List<Person> list) {
        //使用Collections静态类进行排序
        Collections.sort(list, this);
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getName().compareToIgnoreCase(o2.getName());
        if (0 == result) {
            //如果名字相同，根据id排序
            return o1.getId() - o2.getId();
        }
        //否则根据名字升序排
        return result;
    }
}
