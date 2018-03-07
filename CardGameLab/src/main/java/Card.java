public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValueRankFromEnum() {
        return this.rank.getValueRank();
    }

    public int getValueSuitFromEnum() {
        return this.suit.getValueSuit();
    }
}
