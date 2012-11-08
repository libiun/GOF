package templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractClass ac = new ConcerteClass();
        ac.template();
    }
}