package lesson8;

import java.util.Scanner;

import static lesson8.MethodContainer.defineLongestWord;
import static lesson8.MethodContainer.reverseWord;

/*
1) Enter in the console sentence of five words.
2) display the longest word in the sentence
3) determine the number of its letters
4) bring the second word in reverse order
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter some text");
        String sentence = new Scanner(System.in).nextLine();
        String[] words = sentence.split("[ ]");

        String longestWord = defineLongestWord(words);
        System.out.println("The longest word is " + longestWord);
        System.out.println("The length  of the longest word is " + longestWord.length() + " symbols");


        System.out.println("Enter number of word for reversion");
        int indexOfWordForReversion = new Scanner(System.in).nextInt() - 1;
        String wordForReversion = words[indexOfWordForReversion];

        System.out.println("Word for reversion: " + wordForReversion);
        System.out.println("Reversed word: " + reverseWord(wordForReversion));

    }

}
