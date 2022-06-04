import java.security.SecureRandom;

public class DeckOfCards {
    private static final int NUMBER_OF_CARDS = 52;
    private int CurrentCard;
    private static final SecureRandom random = new SecureRandom();
    Card[] deck;

    public DeckOfCards() {
        String[] face = new String[]{"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = new String[]{"Heart", "Diamond", "Club", "Spade"};
        deck = new Card[NUMBER_OF_CARDS];
        CurrentCard = 0;

        for (int count = 0; count < deck.length; ++count)
            deck[count] = new Card(face[count % 13], suits[count / 13]);
    }

    public void Shuffle() {
        CurrentCard = 0;
        for (int card = 0; card < deck.length; ++card) {
            int shuffler = random.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[card];
            deck[card] = deck[shuffler];
            deck[shuffler] = temp;
        }
    }

    public Card CardDealer() {
        if (CurrentCard < deck.length)
            return deck[CurrentCard++];
        else
            return null;
    }
}