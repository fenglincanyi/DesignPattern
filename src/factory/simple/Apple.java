package factory.simple;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Apple extends Fruit {

    @Override
    public void grow() {
        System.out.println("Apple grow");
    }

    @Override
    public void plant() {
        System.out.println("Apple plant");
    }
}
