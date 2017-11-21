package lesson9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write parametrized methods: union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets.
 */
public class App
{
    public static void main( String[] args )
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,3,6,9));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,4,7,9));

        MethodContainer.printSet(MethodContainer.union(set1,set2));

        MethodContainer.printSet(MethodContainer.intersect(set1, set2));
    }
}
