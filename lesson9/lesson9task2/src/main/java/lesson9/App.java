package lesson9;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
1) In the main() method declare map employeeMap of pairs <Integer, String>.
2) Add to employeeMap seven pairs (ID, name) of some persons.
    Display the map on the screen.
3) Ask user to enter ID, then find and write corresponding name from your map.
    If you can't find this ID - say about it to user (use function containsKey()).
4) Ask user to enter name, verify than you have name in your map and write corresponding ID.
    If you can't find this name - say about it to user (use function containsValue()).
*/

public class App
{
    public static void main( String[] args )
    {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(0, "John");
        employeeMap.put(1, "Diana");
        employeeMap.put(2, "Dexter");
        employeeMap.put(3, "Steve");
        employeeMap.put(4, "Kevin");
        employeeMap.put(5, "Maria");
        employeeMap.put(6, "Adam");
        for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
            System.out.println("id: " + entry.getKey() + "; name: " + entry.getValue());
        }

        System.out.println("Enter id of employee, please: ");
        Scanner scanner1 = new Scanner(System.in);
        try {
            int id = scanner1.nextInt();
            if (employeeMap.containsKey(id)) {
                System.out.println(employeeMap.get(id));
            }else {
                System.out.println("There is no employee with id = " + id);
            }
        }catch (InputMismatchException e){
            System.out.println("User entered not integer number");
            e.printStackTrace();
        }

        System.out.println("Enter the name of employee, please: ");
        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();
        if (employeeMap.containsValue(name)) {
            for(Map.Entry<Integer, String> entry : employeeMap.entrySet()){
                if (entry.getValue().equals(name)) {
                    System.out.println("id of " + name + " is " + entry.getKey());
                }
            }
        }else {
            System.out.println("There is no employee with name " + name);
        }
    }
}
