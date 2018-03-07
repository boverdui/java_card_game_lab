import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1, player2;
    Card card1;

    @Before
    public void before() {
        player1 = new Player("Michaela", 0);
        player2 = new Player("Bert", 0);
        card1 = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetName() {
        assertEquals("Michaela", player1.getName());
    }

    @Test
    public void canGetScore() {
        assertEquals(0, player1.getScore());
    }

    @Test
    public void canIncreaseScoreBy1() {
        player1.increaseScoreBy1();
        assertEquals(1, player1.getScore());
    }

    @Test
    public void canGetCardCount() {
        assertEquals(0, player1.getCardCount());
    }

    @Test
    public void canAddCardToHand() {
        player1.addCard(card1);
        assertEquals(1, player1.getCardCount());
    }

    @Test
    public void canGetCardFromHand() {
        player1.addCard(card1);
        assertEquals(card1, player1.getCardFromHand());
    }

}
