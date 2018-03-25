package BlackJack;

import Task_7.Car;

import java.util.Arrays;
import java.util.Collections;

public class Deck {
    private Card[] deck;
    private int index;
    private Card card;
    private int counter = 0;


    public Card[] getDeck() {
        return deck;
    }

    public Deck() {
        this.deck = new Card[32];
    }

    public boolean createDeck(){
        this.card = new Card(Suit.Diamonds, Rank.JACK);
        boolean ifAdd = false;
        for (index = 0; index < deck.length ; index++) {
            if (deck[index] == null){
                break;
            }
//            if (card.equals(deck[index])) {
//                ifAdd = false;
//                break;
//            }
        }
        if (index < deck.length){
            deck[index] = card;
            ifAdd = true;
            counter++;

        }
        System.out.println(card + " " + counter);

        return ifAdd;
    }
    public Card[] fullDeck(){

        for (index = 0; index < deck.length ; index++) {
                if (createDeck()) {
                    deck[index] = card;


                }
        }

        return deck;
    }

    public Card[] shuffle(){
        Collections.shuffle(Arrays.asList(deck));
        return deck;
    }

}
