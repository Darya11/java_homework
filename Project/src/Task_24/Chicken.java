package Task_24;

public class Chicken implements Eatable {
    @Override
    public void eat(String thing) {
        System.out.println("Chicken eats " + thing);
    }
}
