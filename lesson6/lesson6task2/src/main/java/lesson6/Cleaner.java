package lesson6;

public class Cleaner extends Staff{
    public final static String TYPE_PERSON = "Cleaner";

    void salary() {
        System.out.println("My salary is 120 dollars");
    }

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }
}
