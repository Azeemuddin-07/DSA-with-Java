package Inheritance;

public class Main {
    public static void main() {
//        // obect creation of Car.
//        Car c  = new Car("Maruti", "800", 4,5, "Automatic");
//        c.startEngine();
//        c.startAC();
//        c.stopEngine();

        // object creation of Motorcycle
        MotorCycle m = new MotorCycle("Splendor", "BS6", 2, "Straight", "Soft");
        m.startEngine();
        m.stopEngine();
        m.wheelie();

    }
}
