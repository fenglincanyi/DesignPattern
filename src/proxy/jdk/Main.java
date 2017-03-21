package proxy.jdk;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        Service service = new ServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.handle();
    }
}
