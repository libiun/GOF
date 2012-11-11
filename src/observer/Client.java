package observer;

public class Client {

    public static void main(String[] args) {
        ISubject girl=new ConcerteSubject();
        IObserver observer1=new ConcerteObserver();
        IObserver observer2=new ConcerteObserver();
        IObserver observer3=new ConcerteObserver();
        girl.addObserver(observer1);
        girl.addObserver(observer2);
        girl.addObserver(observer3);
        
        girl.notifyObserver("明天跟我开房去！");
    }
}
