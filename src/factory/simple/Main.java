package factory.simple;

public class Main {

    public static void main(String[] args) {
        Fruit apple = Factory.newInstance("Apple");
        if (apple != null) {
            apple.grow();
            apple.plant();
        }

        Fruit pear = Factory.newInstance("Pear");
        if (pear != null) {
            pear.grow();
            pear.plant();
        }
    }
}
