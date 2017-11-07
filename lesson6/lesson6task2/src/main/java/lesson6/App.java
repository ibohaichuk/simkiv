package lesson6;

/*
Create next structure.
1) In abstract class Person with property name, declare abstract method print().
2) In other classes in body of method print() output text “I am a …”.
3) In class Staff declare abstract method salary().
4) In each concrete class create constant TYPE_PERSON.
5) Output type of person in each constructors.
6) Create array of Person and add some Teachers, Cleaners and Students to it.
7) Call method print() for all of it.
8) Call method salary() for all Teachers and Cleaners
 */

public class App 
{
    public static void main( String[] args ){
        Person[] people = new Person[6];
        people[0] = new Teacher();
        people[1] = new Cleaner();
        people[2] = new Student();
        people[3] = new Student();
        people[4] = new Cleaner();
        people[5] = new Teacher();
        System.out.println();

        for (Person person: people){
            person.print();
        }
        System.out.println();

        for (Person person: people){
            if (person instanceof Staff){
                ((Staff) person).salary();
            }
        }

    }
}
