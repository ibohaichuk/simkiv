package lesson8;
/*
Implement a pattern for US currency:
    the first symbol "$", then any number of digits, dot and two digits after the dot.
Enter the text from the console that contains several occurrences of US currency.
Display all occurrences on the screen.
*/
public class App
{
    public static void main( String[] args ) {
        String regExp = "^[$].[0-9]*.[.][0-9]{2}$";
        String test1 = "$543534.23";
        String test2 = "$543534.230";
        String test3 = "$54fds3534.3";
        String test4 = "$.23";
        String test5 = "$432432.";
        String test6 = "$543534";

        System.out.println(test1.matches(regExp));
        System.out.println(test2.matches(regExp));
        System.out.println(test3.matches(regExp));
        System.out.println(test4.matches(regExp));
        System.out.println(test5.matches(regExp));
        System.out.println(test6.matches(regExp));
    }
}
