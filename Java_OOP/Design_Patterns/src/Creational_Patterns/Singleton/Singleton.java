package Creational_Patterns.Singleton;

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Public method to provide the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
