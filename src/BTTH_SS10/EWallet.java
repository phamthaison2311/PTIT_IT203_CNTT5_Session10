package BTTH_SS10;

// Thêm "extends PaymentMethod" để có thể dùng super() và @Override
public class EWallet extends PaymentMethod {
    private String phoneNumber;
    private double balance;

    public EWallet() {
        super();
    }

    public EWallet(String accountName, String paymentId, String phoneNumber, double balance) {
        // Gọi constructor của PaymentMethod
        super();
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Các Getter và Setter...

    @Override
    public void pay(double money) {
        if(money < 0) {
            System.err.println("Số tiền không hợp lệ...");
            return;
        }

        if(balance - money < 0) {
            System.err.println("Không đủ số dư trong ví.");
            return;
        }

        this.balance -= money;
        System.out.println("Ví điện tử: Thanh toán " + money + " thành công.");
    }

    @Override
    public void validate() {
        // Logic kiểm tra số điện thoại (Ví dụ: phải có 10 chữ số)
        if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.err.println("Số điện thoại không hợp lệ!");
        }
    }
}