package factory.register;

/**
 * Created by geng
 * on 2017/9/17.
 */
public class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }


    public static class Factory implements FruitFactory<Apple> {

        @Override
        public Apple create() {
            return new Apple();
        }
    }
}
