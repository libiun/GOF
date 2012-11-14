package strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Person p1 = new Person(1, "lijun", 20);
        Person p2 = new Person(2, "panjie", 35);
        Person p3 = new Person(3, "huangwei", 27);
        Person p4 = new Person(4, "litiegang", 52);

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        System.out.println("未经过姓名排序的人员列表为：");
        for (Person person : list) {
            System.out.println(person.toString());
        }

        System.out.println("-----------------");
        Context context = new Context();

        context.setSortPersonStrategy(new UpPersonWithNameStrategy());
        context.sort(list);
        System.out.println("经过姓名升序的人员列表为：");
        for (Person person : list) {
            System.out.println(person.toString());
        }

        context.setSortPersonStrategy(new DownPersonWithNameStrategy());
        context.sort(list);
        System.out.println("经过姓名降序序的人员列表为：");
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
