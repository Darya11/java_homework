package Task_10;

public class Client extends Person {
    private String address;
    private int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Client(String name) {
        super(name);
    }

    public void callBack(int phoneNumber){
        this.phoneNumber = phoneNumber;
        System.out.println("You will receive a call in a few minutes");
    }

    public void delivery(String adress){
        this.address = adress;
        System.out.println("Your package will be sent to your address");
    }


}
