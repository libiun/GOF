package Strategy;

//算法使用环境
import java.util.List;

public class Context {

    private ISortPersonStrategy sortPerson;

    public void setSortPersonStrategy(ISortPersonStrategy sortPerson) {
        this.sortPerson = sortPerson;
    }

    public void sort(List<Person> list) {
        this.sortPerson.sort(list);
    }
}
