package dutychain;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class BossManager extends Approver {

    public BossManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(OARequest request) {
        System.out.println("二级主管审批 通过: ---"+request.getOrderID()+ "---"+request.getOrderType() + "---"+request.getAmount());
    }
}
