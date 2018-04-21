package Task_24;

public class Fish implements Eatable {
    @Override
    public void eat(String thing) {
        System.out.println("Fish eats " + thing);
    }
}
