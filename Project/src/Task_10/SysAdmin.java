package Task_10;

public class SysAdmin extends Employee {
    private String placeOfWork;


    public SysAdmin(String name, int salary) {
        super(name, salary);
    }


    public void workPlace(String placeOfWork){
        this.placeOfWork = placeOfWork;
        System.out.println("Place of work is: " + placeOfWork);
    }
}
