package factory.simple;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Pear extends Fruit {

    @Override
    public void grow() {
        System.out.println("Pear grow");
    }

    @Override
    public void plant() {
        System.out.println("Pear plant");
    }
}
