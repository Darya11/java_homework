package Task_7;

public class Star {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Airjet airjet = new Airjet();

        Vehicle[] vehicles = new  Vehicle[]{car, train, airjet};
        for (Vehicle transpors: vehicles){
            car.setPassengers(2);
           int a = transpors.getFreePlaces(55);
            System.out.println(a);
        }
        Ticket ticket = new Ticket();
    }
}
