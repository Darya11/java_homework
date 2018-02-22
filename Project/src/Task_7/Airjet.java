package Task_7;

public class Airjet extends Vehicle {
    private String type;
    private int pointsOfdestination;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPointsOfdestination() {
        return pointsOfdestination;
    }

    public void setPointsOfdestination(int pointsOfdestination) {
        this.pointsOfdestination = pointsOfdestination;
    }

    void move() {
        System.out.println("Airjet is in the sky now!");
    }

    public boolean status() {
        boolean status;
        if (type == "private") {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    protected void stewardess() {
        System.out.println("Number of stewardess on your board is 5. ");
    }

    private int numberOfStops() {
        return pointsOfdestination;
    }

    public int getnumberOfStops() {
        System.out.print("Amount of stops is: ");
        return pointsOfdestination;
    }

    public int setnumberOfStops() {
        return pointsOfdestination;
    }

    @Override
    public int getFreePlaces(int quantityOfPlaces) {
        System.out.print("Airjet is private! ");
        System.out.print("Amount of available places is ");
        return 0;

    }
}

