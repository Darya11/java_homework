package Task_14;

public class Fish extends  Wild {

    public Fish(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        System.out.println("...");
    }
}
