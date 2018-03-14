package Task_10;

public class Employee extends Person {
    private String profession;
    private int salary;


    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String profession) {
        super(name);
        this.profession = profession;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, String profession, int salary) {
        super(name);
        this.profession = profession;
        this.salary = salary;
    }

    public void info(){
        System.out.println("Information about an employee: [" + getName() + ", " + profession + ", salary: " + salary + " ]" );
    }
}
