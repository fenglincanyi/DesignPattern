package template;

public class Main {

    public static void main(String[] args) {
        BaseActivity activity = new WorkActivity();
        activity.handle();
        activity = new EducationActivity();
        activity.handle();
    }
}
