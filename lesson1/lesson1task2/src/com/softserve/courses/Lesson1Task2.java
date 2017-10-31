package com.softserve.courses;

import java.util.Scanner;

/*
 * Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
 */
public class Lesson1Task2 {

    public static void main(String[] args) {
        System.out.println("How are you?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        System.out.println("You are " + answer);
    }
}
