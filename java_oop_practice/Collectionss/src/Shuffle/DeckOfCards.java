package Shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private final List<Card> list;
    public DeckOfCards() {
        Card[] deck = new Card[52];
        int currentCard = 0;

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[currentCard] = new Card(face, suit);
                currentCard++;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards() {
        int count = 0;
        for (Card card : list) {
            System.out.printf("%-19s", card);
            count++;
            if (count % 4 == 0) {
                System.out.println();
            }
        }
        if (count % 4 != 0) {
            System.out.println();
        }
    }

}
