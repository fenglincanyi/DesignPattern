package builder;

/**
 * Created by geng
 * on 2017/3/22.
 */
public enum Height {

    TALL, LOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
