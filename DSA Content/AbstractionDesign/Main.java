// purana tareeka


//package AbstractionDesign;
//
//// creating abstract class
//abstract class Bird {
//    abstract void fly();
//
//    abstract void eat();
//}
//
//class Sparrow extends Bird {
//    //@override
//    void fly() {
//        System.out.println("Sparrow is flying...");
//    }
//    // override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//
//}
//class Crow extends Bird {
//    //@override
//    void fly() {
//        System.out.println("Crow is flying...");
//    }
//
//    // override
//    void eat() {
//        // here i change the method string but no need to change into main class
//        System.out.println("Crow eating another way");
//    }
//
//
//}
//
//public class Main {
//
//    public static void doBirdStuff(Bird b) {
//        b.eat();
//        b.fly();
//    }
//
//    //Design Strategy
//    //1. Abstraction divides code into two categories: interface and implementation. So, when creating your component, keep the interface separate from the implementation so that if the underlying implementation changes, the interface stays the same.
//    //
//    //2. In this instance, any program that uses these interfaces would remain unaffected and would require recompilation with the most recent implementation.
//    //
//    //3. Makes code modular and maintainable.
//
//    public static void main(String[] args) {
//        // its called abstract design strategy
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
////        Bird b = new Sparrow();
////        b.eat();
////        b.fly();
////
////        Bird c = new Crow();
////        c.eat();
////        c.fly();
//    }
//
//}




// Newest process to create abstract class by interface

package AbstractionDesign;

// creating abstract class
 interface Bird {
    void fly();

    void eat();
}

class Sparrow implements Bird {
    //@override
    public void fly() {
        System.out.println("Sparrow is flying...2");
    }
    // override
    public void eat() {
        System.out.println("Sparrow eating");
    }

}
class Crow implements Bird {
    //@override
    public void fly() {
        System.out.println("Crow is flying...");
    }

    // override
    public void eat() {
        System.out.println("Crow eating another way");
    }


}

public class Main {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        // its called abstract design strategy
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }

}

