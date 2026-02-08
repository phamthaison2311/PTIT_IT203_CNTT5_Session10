package BTTH_SS10;

public class Main {
    public static void main(String[] args) {
        PaymentMethod card = new CreditCard("Nguyen Van A", "CC01", "1234567812345678", "123", 5000);
        card.validate();
        card.pay(1000);

        Payable rewardPoints = new Payable() {
            private int points = 5000;
            @Override
            public void pay(double amount) {
                double pointsNeeded = amount * 10; // Quy đổi: 1$ = 10 điểm
                if (points >= pointsNeeded) {
                    points -= pointsNeeded;
                    System.out.println("Thanh toán thành công bằng điểm! Còn lại: " + points + " điểm.");
                } else {
                    System.out.println("Không đủ điểm thưởng.");
                }
            }
        };
        rewardPoints.pay(50);
    }
}