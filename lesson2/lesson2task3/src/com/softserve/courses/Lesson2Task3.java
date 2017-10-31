package com.softserve.courses;

import java.util.Scanner;

/*
 * Define integer variable m and set the value of variable n is 1 when m is larger than 0,
 * 0 when m is 0 and -1 when m is less than 0.
 */

public class Lesson2Task3 {

    public static void main(String[] args) {
        int m;
        int n;

        System.out.println("Input one integer number, please:");

        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();

        if (m>0){
            n = 1;
        }
        else if (m==0){
            n=0;
        }
        else {
            n=-1;
        }

        System.out.println("m = " + m + "; " + "n = " + n);

    }
}
