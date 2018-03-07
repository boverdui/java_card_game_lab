public enum Suit {

    HEARTS(4),
    DIAMONDS(3),
    CLUBS(2),
    SPADES(1);

    private int valueSuit;

    Suit(int valueSuit) {
        this.valueSuit = valueSuit;
    }

    public int getValueSuit() {return valueSuit;}

}
