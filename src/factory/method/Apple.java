package factory.method;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Apple extends AbstractFruit {

    @Override
    public void grow() {
        System.out.println("Apple grow");
    }

    @Override
    public void plant() {
        System.out.println("Apple plant");
    }
}
