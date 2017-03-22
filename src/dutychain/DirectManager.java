package dutychain;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class DirectManager extends Approver {

    public DirectManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(OARequest request) {
        if (request.getAmount() < 1000) {
            System.out.println("直接主管 审批通过: ---"+request.getOrderID()+ "---"+request.getOrderType() + "---"+request.getAmount());
        } else {
            System.out.println("----直接主管无法处理，交给二级主管 处理。。。");
            next.processRequest(request);
        }
    }

}
