package BlackJack;

import java.util.Objects;


public class Card {
    private Suit suit;
    private Rank rank;
    public static int quantityCards;

    public Rank getRank() {
        return rank;
    }

    public static int getQuantityCards() {
        return quantityCards;
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit.circleSuit();
        this.rank = rank.circleRank();
        quantityCards++;
    }

    public String toString(){
        return suit + " "+  rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

}

