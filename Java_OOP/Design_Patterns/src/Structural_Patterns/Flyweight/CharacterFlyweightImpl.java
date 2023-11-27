package Structural_Patterns.Flyweight;

public class CharacterFlyweightImpl implements CharacterFlyweight{
    private final char character;

    public CharacterFlyweightImpl(char character) {
        this.character = character;
    }

    @Override
    public void display() {
        System.out.print(character);
    }
}
