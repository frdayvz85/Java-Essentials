package cards;

public class Main {
    public static void main(String[] args) {
        cards.Deck frenchDeck = cards.Deck.makeFrenchDeck();
        while (!frenchDeck.isEmpty()) {
            System.out.println(frenchDeck.draw());
        }
    }
}
