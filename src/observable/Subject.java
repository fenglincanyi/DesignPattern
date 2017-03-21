package observable;

import java.util.ArrayList;

/**
 * Created by geng
 * on 2017/3/21.
 */
public abstract class Subject {

    private ArrayList<Observer> Observers = new ArrayList<>();

    public void addObserver(Observer o) {
        Observers.add(o);
    }

    public void removeObserver(Observer o) {
        Observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer o : Observers) {
            o.update();
        }
    }

    public abstract void changed();
}
