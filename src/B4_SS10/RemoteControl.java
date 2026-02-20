package B4_SS10;

public interface RemoteControl {
    void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn dịnh");
    }
}
