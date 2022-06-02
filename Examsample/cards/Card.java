package cards;

public abstract class Card {
    protected Suit suit;

    protected Card(Suit suit) {
        if (suit == null) {
            throw new IllegalArgumentException();
        }
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit.toString();
    }

}
