public class DeckOfCardTester {
    public static void main(String[] args) {
        DeckOfCards game = new DeckOfCards();
        game.Shuffle();

        for (int i = 0; i < 52; ++i){
            System.out.printf("%-19s",game.CardDealer());

            if (i % 4 == 0)
                System.out.println();
        }
    }
}
