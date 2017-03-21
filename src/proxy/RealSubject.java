package proxy;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("请求代理办事");
    }
}
