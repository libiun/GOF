package adapterwithextends;

/**
 * 实现对外接口的核心类
 */
public class Adapter extends Adaptee implements ITarget {

    @Override
    public void method1() {
        this.method2();
    }
}
