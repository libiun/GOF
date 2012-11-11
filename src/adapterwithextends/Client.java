package adapterwithextends;

public class Client {

    public static void main(String[] args) {
        ITarget target = new Adapter();
        target.method1();
    }
}
