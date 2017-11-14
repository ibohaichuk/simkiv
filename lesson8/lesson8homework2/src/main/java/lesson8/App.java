package lesson8;

/*
1) Enter a sentence that contains the words between more than one space.
2) Convert all spaces, consecutive, one.
    For example, if we introduce the sentence "I    am      learning     Java   Core»,
    we have to get the "I'm learning Java Core»
 */
public class App 
{
    public static void main( String[] args )
    {
        String strSource = "Kyiv    is   a  capital   of                   Ukraine";
        System.out.println(strSource);

        String strResult = strSource.replaceAll("[\\s]{2,}", " ");

        System.out.println(strResult);
    }
}
