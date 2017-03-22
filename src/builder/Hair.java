package builder;

/**
 * Created by geng
 * on 2017/3/22.
 */
public enum Hair {

    SHORT, LONG, STRAIGHT, CURLY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
