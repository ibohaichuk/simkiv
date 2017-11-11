package lesson7;

/*
1) Create a method for calculating the area of a rectangle int squareRectangle(int a, int b),
    which should throw an exception if the user enters negative value.
2) Input values a and b from console.
3) Check the squareRectangle method in the method main.
4) Check to input non-numeric value.
 */

import java.util.InputMismatchException;

public class App
{
    public static void main( String[] args )
    {
        try {
            int area = Rectangle.squareRectangle();
            System.out.println("The square of the rectangle is " + area);
        }catch (InputMismatchException ime){
            System.out.println("You entered not integer number");
            ime.printStackTrace();
        }catch (ArithmeticException ae){
            System.out.println("Sides of the rectangle must be positive");
            ae.printStackTrace();
        }
    }
}
