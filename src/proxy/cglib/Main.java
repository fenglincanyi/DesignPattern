package proxy.cglib;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Service service = (Service) cglibProxy.getInstance(new Service());
        service.handle();
    }
}
