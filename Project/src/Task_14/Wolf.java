package Task_14;

public class Wolf extends Wild {

    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("and I am angry.");
    }
}
