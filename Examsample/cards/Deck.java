package cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card draw() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot draw");
        } else {
            return cards.remove(0);
        }
    }

    public Card makeFrenchDeck() {
        Deck deck = new Deck();

        for (Suit suit : Suit.values()) {
            for (int pips = 1; pips <= 10; ++pips) {
                deck.cards.add(new PipCard(suit, pips));
            }
            for (Face face : Face.values()) {
                if (face != Face.CAVALIER) {
                    deck.cards.add(new FaceCard(suit, face));
                }
            }
        }
        return deck;
    }
}
