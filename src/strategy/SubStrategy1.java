package strategy;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class SubStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("执行 策略1");
    }
}
