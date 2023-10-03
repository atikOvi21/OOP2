public class Main {
    public static void main(String[] args) {

        // LISKOV
        Bird bird = new Ostrich();
        bird.fly(); // This line will throw an exception at runtime.
    }
}