import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() { this.cards = new ArrayList<>(); }

    public void populateDeck() {
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public int getCardCount() {
        return this.cards.size();
    }

//    public Card getCard(int index) {
//        return cards.get(index);
//    }

    public ArrayList<Card> shuffleDeck() {
        populateDeck();
        Collections.shuffle(this.cards);
        return this.cards;
    }


}
