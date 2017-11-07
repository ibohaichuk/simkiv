package lesson6;

public class Student extends Person{
    public final static String TYPE_PERSON = "Student";

    void print() {
        System.out.println("I'm a student");
    }

    public Student() {
        System.out.println(TYPE_PERSON);
    }
}
