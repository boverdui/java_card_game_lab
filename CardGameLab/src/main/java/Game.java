import java.util.ArrayList;

public class Game {

    public void comparePlayerHands(Player player1, Player player2) {
        Card card1 = player1.getCardFromHand();
        Card card2 = player2.getCardFromHand();
        if (card1.getRank().getValueRank() > card2.getRank().getValueRank()) {
            player1.increaseScoreBy1();
        }
        else if (card1.getSuit().getValueSuit() > card2.getSuit().getValueSuit()) {
            player1.increaseScoreBy1();
        }
        else {player2.increaseScoreBy1();}
    }

    public void dealCard(Deck deck, Player player1, Player player2) {
        ArrayList<Card> cards = deck.shuffleDeck();
        player1.addCard(cards.get(0));
        player2.addCard(cards.get(1));
    }

}
