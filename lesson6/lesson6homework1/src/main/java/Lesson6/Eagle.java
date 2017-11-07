package Lesson6;

public class Eagle extends FlyingBird {
    public Eagle() {
        System.out.println("I'm an eagle");
    }

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
