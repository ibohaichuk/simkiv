package lesson7;

import java.util.Scanner;

/*
1) Enter surname, name and patronymic on the console as a variable of type String.
2) Output on the console:
    a) surnames and initials
    b) name
    c) name, middle name and last name
 */

public class App
{
    public static void main( String[] args ){
        String surnameNamePatronymic = new Scanner(System.in).nextLine();

        String [] sArray = surnameNamePatronymic.split("[ ]");
        for (String e: sArray) {
            System.out.println(e);
        }
        System.out.println();

        String surname = sArray[0];
        String name = sArray[1];
        String patronymic = sArray[2];

        System.out.println(name);

        StringBuilder surnameWithInitials = new StringBuilder(surname).append(" ")
                .append((name).charAt(0)).append(".")
                .append(patronymic.charAt(0)).append(".");
        System.out.println(surnameWithInitials);

        String namePatronymicSurname = name + " " + patronymic + " " + surname;
        System.out.println(namePatronymicSurname);
    }

}
