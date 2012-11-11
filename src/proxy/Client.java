package proxy;

public class Client {

    public static void main(String[] args) {
        ISubject subject=new ProxySubject();
        subject.request();
    }
}
