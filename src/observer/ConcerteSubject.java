package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcerteSubject implements ISubject {
    //多个观察者

    private List<IObserver> list = new ArrayList<IObserver>();
    
    @Override
    public void addObserver(IObserver observer) {
        list.add(observer);
    }
    
    @Override
    public void removeObserver(IObserver observer) {
        list.remove(observer);
    }
    
    @Override
    public void notifyObserver(String string) {
        for (IObserver observer : list) {
            observer.update(string);
        }
    }
}
