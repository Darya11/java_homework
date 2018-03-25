package BlackJack;

import java.util.concurrent.Callable;

public class Play {

    public static void main(String[] args) {
        Player player = new Player();
        Deck deck = new Deck();
        deck.createDeck();
        deck.fullDeck();
        Table table = new Table(deck);
        deck.shuffle();
        table.takeCard(player);
        table.takeCard(player);
        System.out.println(table.getCount());



    }
}
