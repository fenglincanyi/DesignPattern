package builder;

/**
 * Created by geng
 * on 2017/3/22.
 */
public enum  Sex {

    MAN, WOMAN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
