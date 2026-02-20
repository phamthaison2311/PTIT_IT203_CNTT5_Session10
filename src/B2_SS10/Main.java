package B2_SS10;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bicycle("Thống Nhất");

        myCar.move();
        myBike.move();
    }
}