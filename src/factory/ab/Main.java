package factory.ab;

public class Main {

    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.newPhone().startPhone();
        appleFactory.newComputer().startComputer();


        AbstractFactory googleFactory = new GoogleFactory();
        googleFactory.newPhone().startPhone();
        googleFactory.newComputer().startComputer();
    }
}
