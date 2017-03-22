package dutychain;

/**
 * Created by geng
 * on 2017/3/22.
 */
public class OARequest {

    private String orderID;
    private Integer amount;
    private String orderType;

    public OARequest(String orderID, Integer amount, String orderType) {
        this.orderID = orderID;
        this.amount = amount;
        this.orderType = orderType;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
