package Task_14;

public class Wild extends Animal {
    private int id;
    private int age;
    private int weight;
    private String color;
    private  boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isPredator = isPredator;
    }

    @Override
    public void voice() {
        System.out.print("Hello. " + "I am wild animal "  );

    }
}
