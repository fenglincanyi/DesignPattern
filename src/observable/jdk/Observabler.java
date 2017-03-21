package observable.jdk;

import java.util.Observable;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Observabler extends Observable {

    public void changed(String msg) {
        setChanged();
        notifyObservers("收到信息： " + msg);
    }
}
