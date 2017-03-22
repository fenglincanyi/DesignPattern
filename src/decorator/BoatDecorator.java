package decorator;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class BoatDecorator implements Boat {

    private Boat boat;

    public BoatDecorator(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void speed() {

    }
}
