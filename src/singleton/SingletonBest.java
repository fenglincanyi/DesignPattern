package singleton;

import java.io.Serializable;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class SingletonBest implements Serializable{

    private static final long serialVersionUID = 124184033823008969L;

    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }

    // 静态内部类，jvm 在类初始化时候就加载，而且不会存在jdk版本的问题
    public static class Singleton {
        public static final Singleton INSTANCE = new Singleton();
    }

    // 防止序列化生成多例
    private Object readResolve() {
        return getInstance();
    }
}
