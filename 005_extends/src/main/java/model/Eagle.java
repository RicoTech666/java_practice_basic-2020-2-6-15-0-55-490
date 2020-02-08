package model;

public class Eagle extends Bird {
    private String prey;

    public Eagle() {
    }

    public Eagle(int age, String weight, double flySpeed, String prey) {
        super(age, weight, flySpeed);
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public void hunt() {
        System.out.println("I just hunted a " + this.prey);
    }
}
