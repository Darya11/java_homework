package Task_14;

public class Domestic extends Animal {
    private int id;
    private String name;
    private int age;
    private int weight;
    private String color;
    private boolean isVaccinated;

    public Domestic(int id, String name, int age, int weight, String color, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void voice() {
        System.out.print("Hello " + "my name is " + name + ". " );

    }
}
