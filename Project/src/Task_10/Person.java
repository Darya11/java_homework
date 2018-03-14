package Task_10;

public class Person  {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public void printName(){
        System.out.println("Name of person: " + name);
    }
}
