package decorator;

public class Main {

    public static void main(String[] args) {
        Boat boat = new SmallBoat();
        boat.move();
        boat.speed();
        boat.stop();

        System.out.println("变变变。。。");

        Boat boat1 = new BigBoat(boat);
        boat1.move();
        boat1.speed();
        boat.stop();
    }
}
