package observable;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        // 注册（订阅）
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // 被观察者发生变化
        subject.changed();
    }
}
