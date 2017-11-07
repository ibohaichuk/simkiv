package lesson6;

public abstract class Staff extends Person {

    void print() {
        System.out.println("I'm a stuff");
    }

    abstract void salary();

    public Staff() {
    }
}
