package observable;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class ConcreteSubject extends Subject {

    @Override
    public void changed() {
        System.out.println("被观察者 变化。。。");
        notifyObserver();
    }
}
