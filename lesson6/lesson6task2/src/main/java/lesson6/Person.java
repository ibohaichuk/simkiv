package lesson6;

public abstract class Person {
    String name;
    abstract void print();

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
