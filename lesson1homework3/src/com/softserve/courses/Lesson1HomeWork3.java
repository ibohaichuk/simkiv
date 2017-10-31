package com.softserve.courses;

import java.util.Scanner;

/*
 * Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 * Talks continued t1, t2 and t3 minutes.
 * How much computer will count for each call separately and all talk together?
 * Input all source data from console, make calculations and output to the screen.
 */
public class Lesson1HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Enter standard unit per minute for country #1, please:");
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        System.out.println("Enter standard unit per minute for country #2, please:");
        int c2 = scanner.nextInt();
        System.out.println("Enter standard unit per minute for country #3, please:");
        int c3 = scanner.nextInt();

        System.out.println("Enter call duration for country #1, please:");
        int t1 = scanner.nextInt();
        System.out.println("Enter call duration for country #2, please:");
        int t2 = scanner.nextInt();
        System.out.println("Enter call duration for country #3, please:");
        int t3 = scanner.nextInt();

        int m1 = c1*t1;
        int m2 = c2*t2;
        int m3 = c3*t3;

        System.out.println("Call from country #1 costs " + m1);
        System.out.println("Call from country #2 costs " + m2);
        System.out.println("Call from country #3 costs " + m3);

        int total = m1+m2+m3;

        System.out.println("All calls cost " + total);
    }
}
