package builder;

/**
 * Created by geng
 * on 2017/3/22.
 */
public enum HumanType {

    WHITE, BALACK, YELLOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
