package template;

/**
 * Created by geng
 * on 2017/3/21.
 */
public abstract class BaseActivity {

    public void handle(){
        getAllContent();
        if (checkAll()) {
            commit();
        }
    }

    abstract boolean checkAll();

    abstract void getAllContent();

    abstract void commit();
}
