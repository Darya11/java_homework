package Task_14;

public class Dog extends  Domestic {
    public Dog(int id, String name, int age, int weight, String color, boolean isVaccinated) {
        super(id, name, age, weight, color, isVaccinated);
    }


    @Override
    public void voice() {
        super.voice();
        System.out.println("Woof");
    }
}
