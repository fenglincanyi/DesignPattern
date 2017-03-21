package factory.method;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public AbstractFruit createFruit() {
        return new Apple();
    }
}
