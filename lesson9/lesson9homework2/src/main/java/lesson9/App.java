package lesson9;


import java.util.*;

/*
1) Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
2) Output the entities of the map on the screen.
3) There are at less two persons with the same firstName among these 10 people?
4) Remove from the map person whose firstName is ”Kevin” (or other).
    Print result.
 */
public class App
{
    public static void main( String[] args )
    {

        Map<String,String> personMap = new HashMap<String, String>();
        personMap.put("Barkley", "Charles");
        personMap.put("Durant", "Kevin");
        personMap.put("Curry", "Stephen");
        personMap.put("West", "Russel");
        personMap.put("Harden", "James");
        personMap.put("Jordan", "Chris");
        personMap.put("Wilkins", "Paul");
        personMap.put("Wall", "Paul");
        personMap.put("Parker", "Marcus");
        personMap.put("Davis", "Antony");

        MethodContainer.printMap(personMap);

        MethodContainer.showValues(personMap);

        System.out.println("Enter the name of persons for removal:");
        Map<String,String> updatedMap = MethodContainer.removeByFirstName(personMap, new Scanner(System.in).nextLine());
        MethodContainer.printMap(updatedMap);


    }
}

