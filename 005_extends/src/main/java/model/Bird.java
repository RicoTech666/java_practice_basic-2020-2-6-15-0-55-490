package model;

public class Bird extends Animal {
    private double flySpeed;

    public Bird() {
    }

    public Bird(int age, int weight, double flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void flying() {
        System.out.println("I am flying in the sky.");
    }
}
