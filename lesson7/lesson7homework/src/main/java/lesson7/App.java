package lesson7;

/*
1) Create method div(), which calculates the dividing of two double numbers.
2) In main method input 2 double numbers and call this method. Catch all exceptions.
3) Write a method readNumber(int start, int end), that read from console integer number and return it,
    if it is in the range [start ... end].
4) If an invalid number or non-number text is read, the method should throw an exception.
5) Using this method write a method main(), that has to enter 10 numbers:
    a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
*/

import java.util.InputMismatchException;
import java.util.Scanner;

import static lesson7.MethodContainer.div;
import static lesson7.MethodContainer.readNumber;

public class App
{
    public static void main( String[] args ){

        try {
            System.out.println("Input 2 double numbers: ");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            div(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.print("Not double number was input");
            e.printStackTrace();
        }

        int start = 1;
        int end = 100;
        int count = 0;
        int[] arr = new int[10];
        while (count < 10) {
            System.out.println("Input integer number: ");
            int currentNumber = readNumber(start, end);
            if (currentNumber!= 0) {
                arr[count] = currentNumber;
                start = currentNumber;
                count++;
                System.out.println(10 - count + " numbers remaining");
            }
        }

        //console output of generated numeric sequence
        System.out.println("Number sequence: ");
        System.out.print("1 < ");
        for (int i: arr) {
            System.out.print(i + " < ");
        }
        System.out.println("100");

    }
}
