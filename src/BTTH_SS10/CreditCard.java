package BTTH_SS10;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId, String cardNumber, String cvv, double creditLimit) {
        super();
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void validate() {
        if (cardNumber.length() == 16) {
            System.out.println("Thẻ hợp lệ.");
        } else {
            System.err.println("Thẻ không hợp lệ (Phải có 16 chữ số).");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount > creditLimit) {
            System.err.println("Vượt quá hạn mức tín dụng!");
        } else {
            System.out.println("Đang thanh toán $" + amount + " bằng thẻ tín dụng...");
        }
    }
}