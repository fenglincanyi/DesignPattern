package dutychain;

public class Main {

    public static void main(String[] args) {
        Approver approver1 = new DirectManager("直接主管");
        Approver approver2 = new SecondaryManager("二级主管");
        Approver approver3 = new BossManager("Boss");

        // 创建责任链
        approver1.setNext(approver2);
        approver2.setNext(approver3);

        // oa 申请单
        OARequest oaRequest1 = new OARequest("001", 1500, "food");
        OARequest oaRequest2 = new OARequest("002", 3000, "device");

        // 处理
        approver1.processRequest(oaRequest1);
        System.out.println();
        approver1.processRequest(oaRequest2);
    }
}
