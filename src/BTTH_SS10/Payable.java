package BTTH_SS10;

public interface Payable {
    void pay(double amount);
}

public abstract class PaymentMethod implements Payable {
    protected String accountName;
    protected String paymentId;

    public PaymentMethod() {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public abstract void validate();
}