package Task_10;

import java.util.Scanner;

public class Manager extends Employee {
    private int hoursOfWork;
    private String service;

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public String getService() {
        return service;
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void provideService(String service){
        this.service = service;
        System.out.println("Services we provide: "+ service);
    }

    public void timeWork(int hoursOfWork){
        this.hoursOfWork = hoursOfWork;
        System.out.println("The time of work is: " + hoursOfWork);
    }

}
