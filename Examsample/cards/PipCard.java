package cards;

public class PipCard extends Card {
    private int pips;

    public PipCard(int pips, Suit suit) {
        super(suit);
        if (pips < 1 || pips > 10) {
            throw new IllegalArgumentException("Pips must be between 1 and 10");
        } else {
            this.pips = pips;
        }
    }

    public String toString() {
        if (pips == 1) {
            return "ACE of SPADES";
        } else {
            return super.toString() + "(" + pips + ")";
        }
    }
}
