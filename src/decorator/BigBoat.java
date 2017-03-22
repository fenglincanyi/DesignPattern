package decorator;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class BigBoat extends BoatDecorator {

    public BigBoat(Boat boat) {
        super(boat);
    }

    @Override
    public void move() {
        System.out.println("move 100km/h");
    }

    @Override
    public void speed() {
        System.out.println("increase 10km/h delta");
    }
}
