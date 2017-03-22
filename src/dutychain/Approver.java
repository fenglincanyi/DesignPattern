package dutychain;

/**
 * Created by geng
 * on 2017/3/22.
 */
public abstract class Approver {

    protected String name;
    protected Approver next;

    public Approver(String name) {
        this.name = name;
    }

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract void processRequest(OARequest request);
}
