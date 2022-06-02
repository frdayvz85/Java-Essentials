package cards;

public class FaceCard extends Card {
    private final Face face;

    public FaceCard(Suit suit, Face face) {
        super(suit);
        this.face = face;
    }

    @Override
    public String toString() {
        return this.face.toString() + " of " + super.toString();
    }

}
