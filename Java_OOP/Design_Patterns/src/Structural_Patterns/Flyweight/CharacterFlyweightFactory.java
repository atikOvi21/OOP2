package Behavioral_Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private final Map<Character, CharacterFlyweight> flyweights = new HashMap<>();

    public CharacterFlyweight getCharacter(char character) {
        if (!flyweights.containsKey(character)) {
            flyweights.put(character, new CharacterFlyweightImpl(character));
        }
        return flyweights.get(character);
    }
}
