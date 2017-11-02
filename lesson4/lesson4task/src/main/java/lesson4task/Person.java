package lesson4task;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int calcAge(int birthYear){
        int currentYear = 2017;
        return (currentYear - birthYear);
    }

    public void inputInfo(){
        System.out.print("Enter name, please: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.print("Enter year of birth, please: ");
        birthYear = scanner.nextInt();
    }

    public void outputInfo(){
        System.out.println("Name: " + name + "\nYear of birth: " + birthYear + "\n");
    }

    //change name by entering new name as parameter
    public void changeName (String newName){
        name = newName;
    }

    //change name by entering new name in console
    public void changeName (){
        System.out.print("Enter new name, please: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }
}
