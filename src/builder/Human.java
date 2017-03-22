package builder;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class Human {

    private final HumanType type;
    private final Sex sex;
    private Hair hair;
    private Height height;

    private Human(Builder builder) {
        this.type = builder.type;
        this.sex = builder.sex;
        this.hair = builder.hair;
        this.height = builder.height;
    }

    public HumanType getType() {
        return type;
    }

    public Sex getSex() {
        return sex;
    }

    public Hair getHair() {
        return hair;
    }

    public Height getSkin() {
        return height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "type=" + type +
                ", sex=" + sex +
                ", hair=" + hair +
                ", height=" + height +
                '}';
    }



    public static class Builder {
        private final HumanType type;
        private final Sex sex;
        private Hair hair;
        private Height height;

        public Builder(HumanType type, Sex sex) {
            this.type = type;
            this.sex = sex;
        }

        public Builder setHair(Hair hair) {
            this.hair = hair;
            return this;
        }

        public Builder setHeight(Height skin) {
            this.height = skin;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}
