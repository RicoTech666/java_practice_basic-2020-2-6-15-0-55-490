package model;

public class Eagle extends Bird {
    private String prey;

    public Eagle() {
    }

    public Eagle(int age, int weight, double flySpeed, String prey) {
        super(age, weight, flySpeed);
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }
}
