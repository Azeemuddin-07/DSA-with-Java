package Polymorphism;

public class Main {
    public static void main(String [] args) {

        // eg of Compile time polymorphism
        Calculator cal = new Calculator();
        System.out.println(cal.add(1,3));
        System.out.println(cal.add(1,3,4));
        System.out.println(cal.add(1,3,4.4, 4.5f));





        // eg of runtime polymorphism
        Circle c = new Circle();
        //c.draw();   // it is basic draw
        doDrawingStuff(c); // it is upscaling

        Rectangle R = new Rectangle();
        //R.draw();  // it is basic draw
        doDrawingStuff(R); // it is upscaling

        // if i create an object of Shape so it calling the Shape method
        Shape s = new Shape();
        doDrawingStuff(s);


//        // eg of downcasting
//        Circle c = new Circle();
//        doDrawingStuff(c);


    }

    // Dynamic method Dispatch or Upcasting.
    // another method create
    public static void doDrawingStuff(Shape s) {
        s.draw();  // polymorphic
        // it give us to use to a easy code writing

//        // downcasting
//        Circle c = (Circle)s; // downcasting
//        c.draw();
    }



}
