package Task_7;

public class Train extends Vehicle {
    private int quantityOfCarriage;



    public int getQuantityOfCarriage() {
        return quantityOfCarriage;
    }

    public void setQuantityOfCarriage(int quantityOfCarriage) {
        this.quantityOfCarriage = quantityOfCarriage;
    }

    @Override
    public int getFreePlaces(int quantityOfPlaces){
        System.out.print("Train is overcrowded. Available places is:");
        return 0;
    }
    boolean isRestaurant(){
        System.out.print("Is in the train a restaurant ? ");
        return true;
    }
    public int quantatyOfCompartments(){
        System.out.print("The quantaty of compartments is: ");
        return quantityOfCarriage / 2;
    }
    protected void destination(){
        System.out.println("Your destination is Paris");
    }
    private int numberOfConductors(){
        return quantityOfCarriage;
    }

    public int  getNumberOfConductors() {
        System.out.print("Amount of conductors in the train is: ");
        return quantityOfCarriage;
    }
    public int  setNumberOfConductors() {
        return quantityOfCarriage;
    }




}
