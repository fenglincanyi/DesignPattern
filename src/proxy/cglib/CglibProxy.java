package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * https://github.com/cglib/cglib/releases
     * cglib-nodep-3.2.4.jar
     */

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib intercept...");
        return methodProxy.invokeSuper(o, objects);// 调用父类的方法
    }


    /**
     * 不依赖 接口，即可实现代理（实现接口的类也是可以的）
     * cglib动态代理中生成的字节码更加复杂，生成的代理类是委托类的子类，且不能处理被final关键字修饰的方法
     * jdk采用反射机制调用委托类的方法，cglib采用类似索引的方式直接调用委托类方法
     */
}
