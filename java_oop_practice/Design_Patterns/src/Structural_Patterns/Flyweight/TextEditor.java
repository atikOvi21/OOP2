package Structural_Patterns.Flyweight;

public class TextEditor {
    private final CharacterFlyweightFactory flyweightFactory = new CharacterFlyweightFactory();

    public void displayText(String text) {
        for (char c : text.toCharArray()) {
            CharacterFlyweight character = flyweightFactory.getCharacter(c);
            character.display();
        }
        System.out.println(); // Line break
    }
}
