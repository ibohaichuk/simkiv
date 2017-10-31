package com.softserve.courses;

/*
 *Define String variables name and address. Output question "What is your name?"
 * Read the value name and output next question: “Where are you live, (name)?".
 * Read address and write whole information.
 */

import java.util.Scanner;

public class Lesson1HomeWork2 {

    public static void main(String[] args) {
        String name;
        String address;

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Where are you live, " + name);
        address = scanner.nextLine();

        System.out.println(name + " lives in " + address);
    }
}
