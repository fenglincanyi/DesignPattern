package adapter.clazz;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.getPower110V();
    }
}
