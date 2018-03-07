import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1, player2;
    Card card1, card2, card3;
    Game game;
    Deck deck;

    @Before
    public void before() {
        player1 = new Player("Michaela", 0);
        player2 = new Player("Bert", 0);
        card1 = new Card(Suit.HEARTS, Rank.ACE);
        card2 = new Card(Suit.HEARTS, Rank.EIGHT);
        card3 = new Card(Suit.SPADES, Rank.ACE);
        game = new Game();
        deck = new Deck();
    }

    @Test
    public void canWinByRank() {
        player1.addCard(card1);
        player2.addCard(card2);
        game.comparePlayerHands(player1, player2);
        assertEquals(1, player1.getScore());
    }

    @Test
    public void canWinBySuit() {
        player1.addCard(card1);
        player2.addCard(card3);
        game.comparePlayerHands(player1, player2);
        assertEquals(1, player1.getScore());
    }

}
