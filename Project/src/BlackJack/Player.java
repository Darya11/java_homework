package BlackJack;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Card> player;
    private int pointsPlayer;

    public Player() {
     this.player = new ArrayList<>();
    }


    public int getPointsPlayer() {
        return pointsPlayer;
    }

    public boolean sayStop() {
        boolean ifTrue = false;
        System.out.println("Press stop if you don't need any additional card or any another button to continue");
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        if (stop.equals("stop")) {
            ifTrue = true;
        }
        return ifTrue;
    }

    public void takeCard(Decka deck){
       player.add(deck.pull());
    }

    public int getPoints(){
        for (Card c: player
                ) {
            pointsPlayer += c.getRank().getRank();

        }
        return pointsPlayer;
    }

    public List<Card> drop(Decka decka){
        decka.addDeck(player);
        player.clear();
        pointsPlayer = 0;
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player=" + player +
                '}';
    }
}

