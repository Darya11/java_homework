package Task_7;

public class Ticket {
    private int id;
    private String name;
    private String lastName;
    private int seat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    void printId(){
        System.out.println("Your ticket id is: "+id);
    }

    public void printName(){
        System.out.println("Name: " + name);
    }

    protected void printLastName(){
        System.out.println("Last name: " + lastName);
    }
    private void printSeat(){
        System.out.println("Seat number: " + seat);
    }
    public void getPrintSeat() {
        this.printSeat();
    }

    public void setPrintSeat() {
        this.printSeat();
    }

}
