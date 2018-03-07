import java.util.ArrayList;

public class Player {
    
    private String name;
    private int score;
    private ArrayList<Card> hand;
    
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int getCardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public Card getCardFromHand() {
        return this.hand.get(0);
    }

    public void increaseScoreBy1() {
        this.score ++;
    }
}
