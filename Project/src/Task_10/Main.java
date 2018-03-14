package Task_10;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Steve");
        Employee employee = new Employee("Drake", "doctor", 1500);
        SysAdmin sysAdmin = new SysAdmin("Brendan", 800);
        Manager manager = new Manager("Mel", 700);
        Worker worker = new Worker("Bill", 500);
        manager.provideService("manage");
        client.callBack(865644);
        employee.info();


        System.out.println((Object)sysAdmin instanceof Client);
        System.out.println(worker instanceof Person);
        System.out.println((Object)worker instanceof Manager);
        System.out.println(sysAdmin instanceof Person);
        System.out.println((Object)manager instanceof Client);
        System.out.println((Object)client instanceof Employee);
        System.out.println(client instanceof Person);




    }


}
