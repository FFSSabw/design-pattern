package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class SubjectDemo implements Subject{
    private List<Observer> observers;
    private Data data;
    
    public SubjectDemo() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        if(o == null) {
            throw new NullPointerException();
        }
        if(!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(data);
        }
    }
    
    public void setData(Data data) {
        this.data = data;
        notifyObserver();
    }
    
    public static void main(String[] args) {
        SubjectDemo subject = new SubjectDemo();
        
        new ObserverDemo(subject);
        new ObserverDemo(subject);
        new ObserverDemo(subject);
        
        subject.setData(new Data(1));
    }
}
