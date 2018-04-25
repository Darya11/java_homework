package BlackJack;


public class Table {
    private Computer computer;
    private Decka deck;
    private static final  int MAGICNUMBER = 21;


    public Table() {
        this.deck = new Decka();
        this.computer = new Computer();
    }

    private void prepareTable(){
        deck.createDeck();
        deck.fullDeck();
        deck.shuffle();

    }

    public void haveGame(Player player){
        prepareTable();
        simpleAction(player);
        player.getPoints();
    }


    public void simpleAction(Player player) {
        if (player.sayStop()){
            System.out.println("YOUR TOTAL POINTS: "+ player.getPoints());
            System.out.println("COMPUTER TOTAL POINTS: " + computer.getPoints());
            System.err.println(computer.toString());
            compareCards(player.getPointsPlayer(), computer.getPointsComputer(), player, computer);
            return;

        }
        else {
            player.takeCard(deck);
            computer.takeCard(deck);

            System.err.println("Your cards: " + player.toString());

            }

                simpleAction(player);
        }

    private void compareCards(int pointsPlayer, int pointsComputer, Player player, Computer computer){
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
            player.drop(deck);
            computer.drop(deck);
            simpleAction(player);

        }

    }

}
