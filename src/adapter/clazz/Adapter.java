package adapter.clazz;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void getPower110V() {
        System.out.println("get Power 110v");
    }
}
