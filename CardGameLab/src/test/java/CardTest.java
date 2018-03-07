import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;

    @Before
    public void before() {
        card1 = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.ACE, card1.getRank());
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.HEARTS, card1.getSuit());
    }

    @Test
    public void canGetValueRank() {
        assertEquals(14, card1.getValueRankFromEnum());
    }

    @Test
    public void canGetValueSuit() {
        assertEquals(4, card1.getValueSuitFromEnum() );
    }

}
