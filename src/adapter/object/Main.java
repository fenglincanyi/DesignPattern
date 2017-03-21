package adapter.object;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
