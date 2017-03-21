package adapter;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void getPower110V() {
        getPower220V();
        System.out.println("-----变成： getPower110V");
    }

    @Override
    public void getPower5V() {
        getPower220V();
        System.out.println("-----变成： getPower5V");
    }
}
