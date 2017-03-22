package dutychain;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class SecondaryManager extends Approver {

    public SecondaryManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(OARequest request) {
        if (request.getAmount() < 2000) {
            System.out.println("二级主管审批 通过: ---"+request.getOrderID()+ "---"+request.getOrderType() + "---"+request.getAmount());
        } else {
            System.out.println("----二级主管无法处理，交给boss 处理。。。");
            next.processRequest(request);
        }
    }
}
