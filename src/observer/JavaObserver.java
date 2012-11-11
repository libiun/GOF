package observer;

//java提供的观察者类
import java.util.Observable;
import java.util.Observer;

class Observer1 implements Observer {
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者一：" + arg);
    }
}

class Observer2 implements Observer {
    
    @Override
    public void update(Observable o, Object arg) {
        if (((Integer) arg).intValue() <= 5) {
            System.out.println("观察者二：" + arg);
        }
    }
}

public class JavaObserver extends Observable {

    public void counter(int number) {
        for (; number >= 0; number--) {
            this.setChanged();
            this.notifyObservers(number);
        }
    }
    
    public static void main(String[] args) {
        JavaObserver jo = new JavaObserver();
        jo.addObserver(new Observer1());
        jo.addObserver(new Observer2());
        jo.counter(10);
    }
}
