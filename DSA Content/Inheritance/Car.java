package Inheritance;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    // ctor
    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        // super() key is always first sentence of this ctor
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }
    // method
    public void startAC () {
        System.out.println("AC started of " + name);
    }

}
