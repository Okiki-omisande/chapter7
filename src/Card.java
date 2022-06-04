public class Card {
    private final String face;
    private final String suit;

    public Card(String CardFace, String CardSuit){
        this.face = CardFace;
        this.suit = CardSuit;
    }

    public String toString(){
        return face + " of "  +  suit;
    }
}
