package lesson8;

import java.util.Scanner;

/*
1) Enter the two variables of type String.
2) Determine whether the first variable substring second.
3) For example, if you typed «IT» and «IT Academy» you must receive true.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter potential substring");
        String s1 = scanner.nextLine();
        System.out.println("Enter string");
        String s2 = scanner.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();
        int count = 0;

        for (int i = 0; i <= l2-l1; i++){
            if (s1.equals(s2.substring(i,i+l1))){
                count++;
            }
        }
        if (count ==0) {
            System.out.println(s1 + "\nis not substring of\n" + s2);
        }else{
            System.out.println(s1 + "\nis found in\n" + s2 + "\n" + count + " times");
        }
    }
}
