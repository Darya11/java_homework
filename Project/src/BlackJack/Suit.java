package BlackJack;


public enum Suit {
    Clubs, Diamonds, Hearts, Spades;
    private int count ;
    private static final Suit[] VALUES = values();
    private static final int SIZE = VALUES.length;


    public static Suit[] getVALUES() {
        return VALUES;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public int getCount() {
        return count;
    }

    public Suit circleSuit(){
        if (SIZE == 0){
            return null;
        }
            if (Card.getQuantityCards() % 8 == 0 && Card.getQuantityCards() != 0) {
                count++;
            }
        return VALUES[count];
    }


}
