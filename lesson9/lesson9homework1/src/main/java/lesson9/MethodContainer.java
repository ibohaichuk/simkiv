package lesson9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MethodContainer {
    public static Set union(Set set1, Set set2){
        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static Set intersect(Set set1, Set set2){
        Set<Object> result = new HashSet<>();
        result.addAll(set1);
        result.retainAll(set2);
        return result;
    }

    public static void printSet(Set set){
        for (Iterator i = set.iterator(); i.hasNext();) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
    }
}
