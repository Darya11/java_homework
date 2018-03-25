package BlackJack;

public class Player {
    private Card[] player;
    private static int players;

    public Player() {
     this.player = new Card[32];
        players++;
    }

    public Card[] getPlayer() {
        return player;
    }

    public boolean getNumberOfPlayers(){
        if (players > 2){
            return false;
        }
        return true;
    }

    public int getPlayers() {
        return players;
    }
}

