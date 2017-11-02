package lesson4task;

/*
1. Create Console Application project in Java.
2. Add class Person to the project.
3. Class Person should consists of
    1) two private fields: name and birthYear (the birthday year)
    2) properties for access to these fields
    3) default constructor and constructor with 2 parameters
    4) methods:
        a) calcAge - to calculate the age of person
        b) inputInfo - to input information about person
        c) outputInfo - to output information about person
        d) changeName - to change the name of person
4. In the method main() create 5 objects of Person type and input information about them.
 */

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("John", 1989);
        Person p2 = new Person();
        Person p3 = new Person("Danylo", 2017);
        Person p4 = new Person("Iryna", 1993);
        Person p5 = new Person("Volodymyr", 1990);

    /*
    My tasks.
    1) test methods: outputInfo(), inputInfo(), changeName()
    2) output info about age of persons
     */
        p1.outputInfo();

        p2.inputInfo();
        p2.outputInfo();

        p3.changeName();
        p3.outputInfo();

        p4.changeName("Irena");
        p4.outputInfo();

        p5.outputInfo();

        System.out.println(p1.getName() + "\'s age is " + p1.calcAge(p1.getBirthYear()));
        System.out.println(p2.getName() + "\'s age is " + p2.calcAge(p2.getBirthYear()));
        System.out.println(p3.getName() + "\'s age is " + p3.calcAge(p3.getBirthYear()));
        System.out.println(p4.getName() + "\'s age is " + p4.calcAge(p4.getBirthYear()));
        System.out.println(p5.getName() + "\'s age is " + p5.calcAge(p5.getBirthYear()));
    }
}
