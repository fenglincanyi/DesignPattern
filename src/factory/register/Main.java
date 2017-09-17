package factory.register;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geng
 * on 2017/9/17.
 */
public class Main {

    private static Map<String, FruitFactory<? extends Fruit>> map = new HashMap<>();

    static{
        map.put("Apple", new Apple.Factory());
        map.put("Pear", new Pear.Factory());
    }


    public static void main(String[] args) {
        map.get("Apple").create().eat();
        map.get("Pear").create().eat();
    }
}
