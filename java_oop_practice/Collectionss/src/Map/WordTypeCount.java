package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordTypeCount {
    private Map<String, Integer> map;
    private final Scanner scanner;

    public WordTypeCount(){
        scanner = new Scanner(System.in);
        createMap();
        displayMap();
    }

    private void createMap(){
        map = new HashMap<>();
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("[\\s,\\p{Punct}&&[^']]+");

        for (String token : tokens) {
            String word = token.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

    private void displayMap() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%-10s%10s%n", key, value);
        }
        System.out.printf("%nWords: %d%nIsEmpty: %b%n", map.size(), map.isEmpty());
    }

}
