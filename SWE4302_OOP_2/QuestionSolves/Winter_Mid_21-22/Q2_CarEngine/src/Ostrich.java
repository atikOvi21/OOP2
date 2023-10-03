public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly.");
    }

    // Here, the Ostrich class overrides the fly() method from the Bird class
    // and throws an exception. This is a violation of the Liskov Substitution
    // Principle because the Ostrich class is not able to replace the Bird
    // class without breaking the program.

}
