package Inheritance;

public class MotorCycle extends Vehicle{
    public String handleBarsStyle;
    public String suspensionType;

    // constructor
    MotorCycle(String name, String model, int noOfTyres, String handleBarsStyle, String suspensionType) {
        super(name, model, noOfTyres);
        this.handleBarsStyle = handleBarsStyle;
        this.suspensionType = suspensionType;
    }

    // behaviour
    public void wheelie() {
        System.out.println(" MotorCycle is doung Wheelieeee " + name);
    }


}
