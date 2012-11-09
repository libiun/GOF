package adapterwithextends;

//从外部无法调用的类，需要被适配的类
public class Adaptee {

    public void method2() {
        System.out.println("外部需要调用的方法");
    }
}
