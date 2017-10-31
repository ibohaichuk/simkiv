package com.softserve.courses;

import java.util.Scanner;

/*
 * Define string variable name and integer value age.
 * Output question "What is your name?"read the value name and output next question:
 * "How old are you?" read the value age and write whole information.
 */
public class Lesson2HomeWork2 {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("My name is " + name + ". I am " + age);

    }
}
