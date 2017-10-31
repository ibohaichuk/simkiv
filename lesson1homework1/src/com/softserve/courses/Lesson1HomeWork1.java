package com.softserve.courses;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;


/*
 * Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
 */

public class Lesson1HomeWork1 {

    public static void main(String[] args) {
        double radius;

        System.out.println("Input radius of a circle, please:");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        double perimeter = 2 * PI * radius;
        double area = PI * pow(radius, 2);

        System.out.println("Perimeter of a circle is " + perimeter);
        System.out.println("Area of a circle is " + area);
    }
}
