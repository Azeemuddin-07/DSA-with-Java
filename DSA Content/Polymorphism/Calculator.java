package Polymorphism;

public class Calculator {
    int add (int a, int b) {
        return a + b;
    }

    // overloading add
    int add(int a, int b, int c){
        return a + b + c;
    }

    // change the types of argument
    double add(int a, int b, double c, float d) {
        return  (a + b + c + d);
    }
}
