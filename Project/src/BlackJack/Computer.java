package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Card> computer;
    private int pointsComputer;

    public Computer() {
        this.computer = new ArrayList<>();
    }


    public int getPointsComputer() {
        return pointsComputer;
    }

    public void takeCard(Decka deck){
        computer.add(deck.pull());
    }

    public int getPoints(){
        for (Card c: computer
                ) {
            pointsComputer += c.getRank().getRank();

        }
        return pointsComputer;
    }

    public List<Card> drop(Decka decka){
        decka.addDeck(computer);
        computer.clear();
        pointsComputer = 0;
        return computer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computer=" + computer +
                '}';
    }
}
