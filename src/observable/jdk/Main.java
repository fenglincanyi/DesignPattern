package observable.jdk;

public class Main {

    public static void main(String[] args) {
        Observabler observabler = new Observabler();
        Observerr observerr1 = new Observerr();
        Observerr observerr2 = new Observerr();

        observabler.addObserver(observerr1);
        observabler.addObserver(observerr2);

        observabler.changed("观察者变了");
    }
}
