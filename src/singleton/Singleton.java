package singleton;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Singleton {

//    private static Singleton singleton;

//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

//    public static synchronized Singleton getSingleton() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }



//    // DCL
//    private static volatile Singleton singleton;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

}
