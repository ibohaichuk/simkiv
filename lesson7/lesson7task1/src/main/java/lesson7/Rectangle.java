package lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle {
    static int squareRectangle() throws InputMismatchException, ArithmeticException{
        System.out.println("Enter the sides of the rectangle, please (integer number only): ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<=0){
            throw new ArithmeticException();
        }
        int b = scanner.nextInt();
        if (b<=0){
            throw new ArithmeticException();
        }
        return a*b;
    }
}
