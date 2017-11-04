package Lesson5Homework2;

/*
Create an array of ten integers.
Display 
    1) the biggest of these numbers;
    2) the sum of positive numbers in the array;
    3) the amount of negative and positive numbers in the array.
What values there are more: negative or positive?
*/

import static Lesson5Homework2.MethodContainer.*;

public class App {

    public static void main(String[] args) {

        int[] intArray = {5, 17, 0, -77, 123, 12, -9, -13, 6, 5};

        int maxValue = calcMax(intArray);
        System.out.println("The biggest number in array is " + maxValue);

        int sumOfPositives = calcSumOfPositiveNumbers(intArray);
        System.out.println("The sum of positive numbers in the array is " + sumOfPositives);

        int positiveNumbers = calcAmountOfNumbersBySign(intArray, 1);
        System.out.println("The amount of positive numbers is " + positiveNumbers);

        int negativeNumbers = calcAmountOfNumbersBySign(intArray, -1);
        System.out.println("The amount of negative numbers is " + negativeNumbers);

        int zeros = calcAmountOfNumbersBySign(intArray, 0);
        System.out.println("The amount of zeros is " + zeros);

        printWhichNumbersIsMore(positiveNumbers, negativeNumbers);
    }
}
