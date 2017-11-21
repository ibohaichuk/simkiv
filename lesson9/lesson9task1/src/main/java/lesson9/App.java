package lesson9;

import java.util.*;

/*
1. Declare collection myCollection of 10 integers and fill it (from the console or random).
2. Find and save in list newCollection all positions of element more than 5 in the collection.
    Print newCollection
3. Remove from collection myCollection elements, which are greater then 20.
    Print result
4. Insert elements 1, -3, -4 in positions 2, 8, 5.
    Print result in the format: “position – xxx, value of element – xxx”
5. Sort and print collection
 */
public class App
{
    public static void main( String[] args ){
        List<Integer> myCollection = new ArrayList<>(15);
        for(int i=0; i<10; i++){
            myCollection.add((int) (Math.random()*30));
        }
        System.out.println("myCollection: " + myCollection + "\n");

        List<Integer>newCollection = new ArrayList<>();
        ListIterator<Integer> it1 = myCollection.listIterator();
        while (it1.hasNext()){
            if (it1.next()>5){
                newCollection.add(it1.nextIndex());
            }
        }
        System.out.println("newCollection: " + newCollection + "\n");

        myCollection.removeIf(element -> element>20);
        System.out.println("Updated myCollection: " + myCollection + "\n");

        try {
            myCollection.add(1, 1);
            myCollection.add(4, -4);
            myCollection.add(7, -3);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Attempt to insert element with out of bound index ");
            e.printStackTrace();
        }
        for (int i =0; i<myCollection.size(); i++) {
            System.out.println("position - " + (i+1) + ", value of element - " + myCollection.get(i));
        }
        System.out.println();

        Collections.sort(myCollection);
        for (int i=0; i<myCollection.size(); i++) {
            System.out.println("position - " + (i+1) + ", value of element - " + myCollection.get(i));
        }
    }
}
