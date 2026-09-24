package Inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    // parameterized ctor
    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public Vehicle() {
    }

    void startEngine () {
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("Engine is stopping of %s : %s\n", name, model);

    }



}


