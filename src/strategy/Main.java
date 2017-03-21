package strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new SubStrategy1());
        context.startStrategy();

        context = new Context(new SubStrategy2());
        context.startStrategy();
    }
}
