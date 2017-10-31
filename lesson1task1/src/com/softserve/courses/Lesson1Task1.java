package com.softserve.courses;

import java.util.Scanner;

/*
 * Define integer variables a and b. Read values a and b from Console and calculate: a + b, a - b, a * b, a / b.
 * Output obtained results.
 */
public class Lesson1Task1 {

    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Input two integer numbers, please:");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
