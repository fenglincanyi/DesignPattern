package factory.register;

/**
 * Created by geng
 * on 2017/9/17.
 */
public class Pear implements Fruit {


    @Override
    public void eat() {
        System.out.println("吃梨");
    }


    public static class Factory implements FruitFactory<Pear>{

        @Override
        public Pear create() {
            return new Pear();
        }
    }
}
