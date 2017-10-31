package com.softserve.courses;

import java.util.Scanner;

/*
 * Write a program to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
 */

public class Lesson2HomeWork4 {

    public static void main(String[] args) {
        String mainSymbol = "*";
        String separator = " ";

        System.out.println("Enter the number of rows, please: ");

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        /*
         * Variant #1. New line starts immediately after last main symbol
         * advantages: faster
         * disadvantages: if separator symbol is visible give asymmetric picture
         */
        for (int currentRow = 1; currentRow <= rows; ++currentRow) {
            for (int separatorCounter = 1; separatorCounter <= 2* (rows-currentRow); separatorCounter++){
                System.out.print(separator);
            }
            for (int mainSymbolCounter =1; mainSymbolCounter < (currentRow*2-1); mainSymbolCounter++){
                System.out.print(mainSymbol+separator);
            }
            System.out.println(mainSymbol);
        }

        System.out.println("\n");

        /*
         * Variant #2. Every line has similar length
         * advantages: universal, give symmetric picture with any separator symbols (visible and invisible)
         * disadvantages: slower
         */
        for (int currentRow = 1; currentRow <= rows; ++currentRow) {
            for (int separatorCounter = 1; separatorCounter <= 2 * (rows - currentRow); separatorCounter++) {
                System.out.print(separator);
            }
            for (int mainSymbolCounter = 1; mainSymbolCounter < (currentRow * 2 - 1); mainSymbolCounter++) {
                System.out.print(mainSymbol+separator);
            }
            System.out.print(mainSymbol);
            for (int separatorCounter = 1; separatorCounter <= 2 * (rows - currentRow); separatorCounter++) {
                System.out.print(separator);
            }
            System.out.println();
        }
    }
}