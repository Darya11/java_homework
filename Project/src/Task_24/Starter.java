package Task_24;

public class Starter {
    public static void main(String[] args) {
        Eatable chicken = new Chicken();
        Eatable fish = new Fish();
        Eatable worm = new Eatable() {
            @Override
            public void eat(String thing) {
                System.out.println("Worm eats " + thing);
            }
        };
        chicken.eat("corn");
        fish.eat("seaweed");
        worm.eat("plant");
    }
}
