package lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MethodContainer {
    static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + "; ");
        }
        System.out.println();
    }

    static void showValues(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        if (map.size()==set.size()){
            System.out.println("There are NO persons with identical first names");
        }else {
            System.out.println("Collection includes persons with identical first names");
        }
    }

    static Map<String,String> removeByFirstName(Map<String, String> map, String firstName){
        Map <String,String> updatedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getValue().equals(firstName)){
                updatedMap.put(entry.getKey(), entry.getValue());
            }
        }
        return updatedMap;
    }
}

