package com.softserve.courses;

import java.util.Scanner;

/*
 * There is a leap year every year whose number is perfectly divisible by 4
 * - except for years which are both divisible by 100 and not divisible by 400.
 * Use one condition If together with Logical operators.
 */

public class Lesson2HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Enter some year, please: ");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year%4==0)&&(year%100==0)&&(year%400!=0)){
            System.out.println(year + " is a leap year ");
        }
        else{
            System.out.println(year + " is NOT a leap year ");
        }
    }
}
