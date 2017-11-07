package Lesson6;

public class FlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("I can fly!");
    }

    public FlyingBird() {
    }

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }
}
