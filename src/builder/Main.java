package builder;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human.Builder(HumanType.BALACK, Sex.MAN)
                .setHair(Hair.CURLY)
                .setHeight(Height.TALL)
                .build();
        Human human2 = new Human.Builder(HumanType.WHITE, Sex.WOMAN)
                .setHair(Hair.LONG)
                .setHeight(Height.TALL)
                .build();
        Human human3 = new Human.Builder(HumanType.YELLOW, Sex.MAN)
                .setHair(Hair.SHORT)
                .setHeight(Height.LOW)
                .build();
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
