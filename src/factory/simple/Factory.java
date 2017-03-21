package factory.simple;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Factory {

    public static Fruit newInstance(String typeName) {
        if (typeName.equals("Apple")) {
            return new Apple();
        } else if (typeName.equals("Pear")) {
            return new Pear();
        } else {
            return null;
        }
    }
}
