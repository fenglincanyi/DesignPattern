package factory.ab;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class GoogleFactory extends AbstractFactory {

    @Override
    public Phone newPhone() {
        return new Nexus();
    }

    @Override
    public Computer newComputer() {
        return new GooglePC();
    }
}
