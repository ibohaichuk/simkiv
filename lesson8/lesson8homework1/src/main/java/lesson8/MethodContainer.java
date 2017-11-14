package lesson8;

public class MethodContainer {

    static String defineLongestWord(String[] words) {
        int maxLength = 0;
        String longestWord = "";
        for (String word: words) {
            if (word.length()>maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    static StringBuilder reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();

        for (int i = word.length()-1; i >=0; i--) {
            reversedWord = reversedWord.append(word.charAt(i));
        }
        return reversedWord;
    }
}
