import com.sun.istack.internal.NotNull;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    private Deck deck;
    private Card card1;
    private Card card2;

    @Before
    public void before() {
        deck = new Deck();
        card1 = new Card(Suit.HEARTS, Rank.ACE);
        card2 = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canGetCardCount() {
        assertEquals(0, deck.getCardCount());
    }

//    @Test
//    public void canGetCardFromDeck() {
//        assertNotNull(deck.getCard(0));
//    }

}
