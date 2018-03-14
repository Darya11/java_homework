package Task_10;

public class Worker extends Employee {
    private int timeOfWork;

    public int getTimeOfWork() {
        return timeOfWork;
    }

    public Worker(String name, int salary) {
        super(name, salary);
    }
    public void hours(int timeOfWork){
        this.timeOfWork = timeOfWork;
        System.out.println(timeOfWork);
    }
}
