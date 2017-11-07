package Lesson6;

public class NonFlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("I can NOT fly!");
    }

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public NonFlyingBird() {

    }
}
