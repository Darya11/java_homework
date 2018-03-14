package Task_14;

public class Guide_dog extends Domestic {
    private boolean isTrained;


    public Guide_dog(int id, String name, int age, int weight, String color, boolean isVaccinated, boolean isTrained) {
        super(id, name, age, weight, color, isVaccinated);
        this.isTrained = isTrained;
    }

    public void takeHome(){
        System.out.println("Follow me");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("I can take you home");
    }
}
