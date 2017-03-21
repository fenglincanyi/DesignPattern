package factory.ab;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public Phone newPhone() {
        return new Iphone();
    }

    @Override
    public Computer newComputer() {
        return new Mac();
    }
}
