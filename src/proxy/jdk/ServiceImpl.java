package proxy.jdk;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class ServiceImpl implements Service {
    @Override
    public void handle() {
        System.out.println("ServiceImpl handle");
    }
}
