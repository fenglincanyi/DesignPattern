package proxy;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
        System.out.println("代理完成工作");
    }
}
