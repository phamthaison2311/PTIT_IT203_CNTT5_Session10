package BTTH_SS10;

public abstract class PaymentMethod implements Payable {
    protected String accountName;
    protected String paymentId;

    public PaymentMethod() {
    }

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public abstract void validate();
}