package BlackJack;

import Task_7.Car;

import java.util.Random;

public class Card {
    private Suit suit;
    private Rank rank;
    public static int quantityCards;

    public Suit getSuit() {
        return suit;
    }

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


    public void cards(Card card){
        System.out.println(card);

    }
    public String toString(){
        return suit + " "+  rank;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null){
//            return false;
//        }
//        if (this == obj){
//            return true;
//        }
//        if (getClass() != obj.getClass()){
//            return false;
//        }
//        Card newCard = (Card) obj;
//        return suit.equals(newCard.suit) && rank.equals(newCard.rank);
//    }
}

