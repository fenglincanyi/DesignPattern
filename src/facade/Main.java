package facade;

public class Main {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.handle();

        System.out.println();

        systemFacade.cancel();
    }
}
