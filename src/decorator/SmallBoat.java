package decorator;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class SmallBoat implements Boat {

    @Override
    public void move() {
        System.out.println("move 50km/h");
    }

    @Override
    public void stop() {
        System.out.println("stop takes 1min");
    }

    @Override
    public void speed() {
        System.out.println("increase 2km/h delta");
    }
}
