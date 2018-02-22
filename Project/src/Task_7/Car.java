package Task_7;

public class Car extends Vehicle {
    private int engine;
    private int passengers;

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
    public int getPassengers(int passengers) {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    void carClass(){
        System.out.println("Your car Class is S");
    }
    public void positionOfHelm(){
        System.out.println("Your helm position is left-side!");
    }
    protected int volume(int baggage){
        System.out.print("Free volume for baggage is: ");
        int freeVolume = 0;
        if(0<=baggage && baggage<=100){
            freeVolume = 100 - baggage;
        }
        return freeVolume;
    }

    private void enginePower(){
        System.out.println("Your engine power is: " + engine);
    }
    public void getEnginePower() {
        this.enginePower();
    }

    public void setEnginePower() {
        this.enginePower();
    }

    @Override
    protected void colorful(){
        System.out.println("Your color was changed");
    }
    @Override
    public int getFreePlaces(int quantityOfPlaces){
        System.out.print("You don't need to buy a ticket. ");
        System.out.print("Your number of passengers is: " );
        return passengers;

    }





}

