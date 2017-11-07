package Lesson6;

/*
1) Create interface Animal with methods voice() and feed().
2) Create two classes Cat and Dog, which implement this interface.
3) Create array of Animal and add some Cats and Dogs to it.
4) Call voice() and feed() method for all of it
 */

public class App {
    public static void main (String[] args){
        Animal[] animals = new Animal[5];
        animals[0] = new Dog ();
        animals[1] = new Cat ();
        animals[2] = new Cat ();
        animals[3] = new Dog ();
        animals[4] = new Dog ();

        for (Animal animal: animals) {
        animal.voice();
        animal.feed();
        }
    }
}
