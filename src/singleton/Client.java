package singleton;

public class Client {

    public static void main(String[] args) {
        Singleton firstobj = Singleton.getInstance();
        Singleton secondobj = Singleton.getInstance();
        System.out.println(firstobj.equals(secondobj));
    }
}
