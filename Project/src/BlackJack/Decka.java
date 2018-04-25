package BlackJack;


import java.util.*;

public class Decka {
        private List<Card> deck;
        private Card card;
        private final static int SIZE = 32;
        private int lastElement = SIZE - 1;

        public List<Card> getDeck() {
            return deck;
        }

        public Decka() {
            this.deck = new ArrayList<>(SIZE);
        }

        public void createDeck() {
            this.card = new Card(Suit.Diamonds, Rank.JACK);
            deck.add(card);

        }

        public List<Card> fullDeck() {
            while (deck.size()< SIZE) {
                createDeck();
            }
            return deck;
        }

        public List<Card> shuffle() {
            Collections.shuffle(deck);
            return deck;
        }

        public Card pull(){
            Card removedCard = deck.remove(lastElement);
            lastElement--;
            return removedCard;

        }

        public List<Card> addDeck(List<Card> player){
            deck.addAll(player);
            return deck;
        }

    @Override
    public String toString() {
        return "Decka{" +
                "deck=" + deck +
                '}';
    }
}
