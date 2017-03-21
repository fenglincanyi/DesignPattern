package factory.method;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Pear extends AbstractFruit {

    @Override
    public void grow() {
        System.out.println("Pear grow");
    }

    @Override
    public void plant() {
        System.out.println("Pear plant");
    }
}
