package lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodContainer {
    static double div(double a,double b) throws ArithmeticException, InputMismatchException{
        System.out.println(a/b);
        return a/b;
    }

    static int readNumber(int start, int end) throws InputMismatchException, IndexOutOfBoundsException{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number >= start && number <= end) || (number<= start && number>=end)) {
            return number;
        }else {
            System.out.println("Number is out off range");
            return 0;
        }
    }
}
