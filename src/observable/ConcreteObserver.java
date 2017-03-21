package observable;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("观察者 收到信息。。。");
    }
}
