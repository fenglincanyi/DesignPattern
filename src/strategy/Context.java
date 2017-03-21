package strategy;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void startStrategy(){
        strategy.execute();
    }
}
