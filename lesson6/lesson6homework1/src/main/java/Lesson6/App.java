package Lesson6;
/*
1) Develop abstract class Bird with attributes feathers and layEggs and an abstract method fly().
2) Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Kiwi.
3) Create array Bird and add different birds to it.
4) Call fly() method for all of it. Output the information about each type of created bird.
 */
public class App 
{
    public static void main( String[] args )
    {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("white", 3);
        birds[1] = new Kiwi("grey", 2);
        birds[2] = new Swallow("black", 5);
        birds[3] = new Penguin("black", 1);

        for (Bird bird : birds) {
            if (bird instanceof Eagle){
                System.out.println("I'm an eagle");
                System.out.println("I have " + bird.getFeathers() + " feathers and lay " +
                        bird.getLayEggs() + " eggs");
                bird.fly();
                System.out.println();
            }else if (bird instanceof Swallow) {
                System.out.println("I'm a swallow");
                System.out.println("I have " + bird.getFeathers() + " feathers and lay " +
                        bird.getLayEggs() + " eggs");
                bird.fly();
                System.out.println();
            }else if (bird instanceof Kiwi){
                System.out.println("I'm a kiwi");
                System.out.println("I have " + bird.getFeathers() + " feathers and lay " +
                        bird.getLayEggs() + " eggs");
                bird.fly();
                System.out.println();
            }else{
                System.out.println("I'm a penguin");
                System.out.println("I have " + bird.getFeathers() + " feathers and lay " +
                        bird.getLayEggs() + " eggs");
                bird.fly();
                System.out.println();
            }
        }
    }
}
