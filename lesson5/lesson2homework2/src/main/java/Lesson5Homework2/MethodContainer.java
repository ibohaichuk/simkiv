package Lesson5Homework2;

public class MethodContainer {
    static int calcMax(int[] intArray) {
        int maxValue = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
        }
        return maxValue;
    }

    static int calcSumOfPositiveNumbers(int[] intArray){
        int sumOfPositiveNumbers = 0;

        for (int number : intArray) {
            if (number > 0) {
                sumOfPositiveNumbers += number;
            }
        }
        return sumOfPositiveNumbers;
    }

    static int calcAmountOfNumbersBySign(int[] intArray, int signParameter){
        int amountOfNegativeNumbers = 0;
        int amountOfPositiveNumbers = 0;
        int amountOfZeros = 0;

        for (int number : intArray) {
            if (number > 0) {
                amountOfPositiveNumbers++;
            } else if (number < 0) {
                amountOfNegativeNumbers++;
            } else{
                amountOfZeros++;
            }
        }

        if (signParameter>0){
            return amountOfPositiveNumbers;
        } else if (signParameter<0) {
            return amountOfNegativeNumbers;
        }else {
            return amountOfZeros;
        }
    }

    static void printWhichNumbersIsMore (int positiveNumbers, int negativeNumbers){
        if (positiveNumbers>negativeNumbers){
            System.out.println("There are more POSITIVE numbers");
        }else if (positiveNumbers<negativeNumbers){
            System.out.println("There are more NEGATIVE numbers");
        }else {
            System.out.println("Amount of positive and negative numbers is identical");
        }
    }
}
