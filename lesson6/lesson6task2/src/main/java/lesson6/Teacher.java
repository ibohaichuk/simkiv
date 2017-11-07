package lesson6;

public class Teacher extends Staff{
    public final static String TYPE_PERSON = "Teacher";


    void salary() {
        System.out.println("My salary is 150 dollars");
    }

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }

}
