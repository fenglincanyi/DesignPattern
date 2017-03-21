package factory.method;

public class Main {

    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        AbstractFruit apple = appleFactory.createFruit();
        apple.grow();
        apple.plant();

        AbstractFactory pearFactory = new PearFactory();
        AbstractFruit pear = pearFactory.createFruit();
        pear.grow();
        pear.plant();
    }
}
