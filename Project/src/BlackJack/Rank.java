package BlackJack;

import java.time.temporal.ValueRange;
import java.util.Random;

public enum Rank {
    SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(2), QUEEN(3), KING(4), ACE(11);
    private int count;
    private final int RANK;
    private static final Rank[] VALUES = values();
    private static final int SIZE = VALUES.length;
//    private static final Random RANDOM = new Random();

    Rank(int rank) {
        this.RANK = rank;
    }

    public int getRank() {
        return RANK;
    }

    public int getCount() {
        return count;
    }

    public Rank circleRank(){
        if (SIZE == 0){
            return null;
        }

        if (Card.getQuantityCards() % 8 == 0 ){
            count = -1;
        }

        count++;

        return VALUES[count];

    }




}

