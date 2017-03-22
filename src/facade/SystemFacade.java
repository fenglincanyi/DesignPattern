package facade;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class SystemFacade {

    private SystemA systemA;
    private SystemB systemB;

    public SystemFacade() {
        systemA = new SystemA();
        systemB = new SystemB();
    }

    public void handle(){
        systemA.start();
        systemB.start();
        systemA.run();
        systemB.run();
    }

    public void cancel(){
        systemA.stop();
        systemB.stop();
    }
}
