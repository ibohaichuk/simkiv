package com.softserve.courses;

/*
 * Write the code to find the sum of first 10 natural numbers.
 */

public class Lesson2Task4 {

    public static void main(String[] args) {
        int n0;
        int q0 = 10;

        /*
         * 1st point of view: zero is natural number
         */
        int sumZeroIncluded =0;

        for (n0=0; n0<q0; n0++){
            sumZeroIncluded += n0;
        }
        System.out.println("Sum of first " + q0 + " natural numbers (zero included) is " + sumZeroIncluded);


        /*
         * 2nd point of view: zero is NOT natural number
         */
        int n1;
        int q1 = 10;

        int sumZeroExcluded = 0;

        for (n1=1; n1<=q1; n1++){
            sumZeroExcluded += n1;
        }
        System.out.println("Sum of first " + q1 + " natural numbers (zero excluded) is " + sumZeroExcluded);
    }
}
