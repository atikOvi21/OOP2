package Structural_Patterns.Adapter.WoW;

public class Player {
    private final String name;
    private final int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    public void defend() {
        System.out.println(name + " defends!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Health: " + health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

