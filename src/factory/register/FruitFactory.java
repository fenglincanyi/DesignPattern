package factory.register;

/**
 * Created by geng
 * on 2017/9/17.
 */
public interface FruitFactory<T extends Fruit> {

    T create();
}
