package BlackJack;

import java.util.Scanner;

public class Table {
    private Card[] computer;
    private Deck deck;
    private int indexDeck;
    private int indexPlayer;
    private int indexComputer;
    private int count;
    private int pointsPlayer ;
    private int pointsComputer;
    private static final  int MAGICNUMBER = 21;

    public int getCount() {
        return count;
    }

    public Table(Deck deck) {
        this.computer = new Card[32];
        this.deck = deck;
    }
    public void print(){

        for (Card card: deck.getDeck()
             ) {
            System.out.println(card);
        }

    }

    public void printComputerCards(){
        System.out.println("Computer cards: ");
        for (Card cards : computer
                ) {
            if (cards != null) {
                System.out.println(cards);
            }
        }

    }

    public void takeCard(Player player) {

        if (sayStop(player)){
            printComputerCards();
            System.out.println(pointsComputer);
            compareCards(pointsPlayer, pointsComputer, player);
            return;
        }

            else if (indexDeck < deck.getDeck().length) {
                player.getPlayer()[indexPlayer] = deck.getDeck()[indexDeck];
                deck.getDeck()[indexDeck] = null;
                pointsPlayer += player.getPlayer()[indexPlayer].getRank().getRank();
                System.out.println(pointsPlayer);
                indexDeck++;
                indexPlayer++;
                computer[indexComputer] = deck.getDeck()[indexDeck];
                deck.getDeck()[indexDeck] = null;
                pointsComputer += computer[indexComputer].getRank().getRank();
                indexDeck++;
                indexComputer++;


                System.out.println("Your cards: ");
                for (Card card : player.getPlayer()
                        ) {
                    if (card != null) {
                        System.out.println(card);
                    }
                }

            }
        takeCard(player);
        }



    public boolean sayStop(Player player){
        boolean ifTrue = false;
        System.out.println("Press stop if you don't need any additional card or any another button to continue");
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        if (stop.equals("stop")){
            ifTrue = true;
        }
        return ifTrue;

    }
    public void compareCards(int pointsPlayer, int pointsComputer, Player player){
        if (pointsPlayer == MAGICNUMBER){
            System.out.println("Winner is a player!");
        }
        if (pointsComputer == MAGICNUMBER){
            System.out.println("Winner is a computer!");
        }
        if (Math.abs(pointsPlayer - MAGICNUMBER) < Math.abs(pointsComputer - MAGICNUMBER)){
            System.out.println("Winner is a player!");
        }
        if (Math.abs(pointsPlayer - MAGICNUMBER) > Math.abs(pointsComputer - MAGICNUMBER)){
            System.out.println("Winner is a Computer!");
        }
        if (pointsPlayer == pointsComputer){
            System.out.println("Dead heat!");
            takeCard(player);
        }

    }




}
