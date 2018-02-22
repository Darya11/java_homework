package Task_7;

public class Vehicle {
    private String model;
    private int speed;
    private int timeInRoad;
    private String color;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTimeInRoad() {
        return timeInRoad;
    }

    public void setTimeInRoad(int timeInRoad) {
        this.timeInRoad = timeInRoad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int square(){
      return speed * timeInRoad;

    }
    public int getFreePlaces(int quantityOfPlaces){
        return quantityOfPlaces;
    }

    protected void colorful(){
        System.out.println("Your color wasn't changed");
    }
    private void serviceable(){
        System.out.println("Ready for exploitation!");
    }
    public void getServiceable() {
        this.serviceable();
    }

    public void setServiceable() {
        this.serviceable();
    }




}
