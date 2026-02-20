package B3_SS10;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void introduce();

    interface Swimmable {
        void swim();
    }

    interface Flyable {
        void fly();
    }
}
