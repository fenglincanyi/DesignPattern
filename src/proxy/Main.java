package proxy;

public class Main {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
