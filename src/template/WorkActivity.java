package template;

/**
 * Created by geng
 * on 2017/3/21.
 */
public class WorkActivity extends BaseActivity {

    @Override
    boolean checkAll() {
        System.out.println("校验 工作经历 字段");
        return true;
    }

    @Override
    void getAllContent() {
        System.out.println("获取 工作经历 所有字段内容");
    }

    @Override
    void commit() {
        System.out.println("提交 工作经历 给服务器");
    }

    // handle() 方法不再重写，如果有特殊逻辑，可以实现
}
