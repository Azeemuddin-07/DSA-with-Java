package JavaFrameworkCollection;

import java.util.Vector;

public class VectorConcept {
    // it is based on Synchronization each individual operation.
    // it is generally used in concurrency
    public static void main(String[] args) {
        // create integer type vector
        Vector<Integer> vec = new Vector<>();
        vec.add(34);
        vec.add(99);
        vec.add(49);
        System.out.println(vec);
        vec.remove(2);
        System.out.println(vec);
        // this is so on... all method are used in it which is defined in ArrayList/LinkedList


    }

    // create String type vector
//    Vector<String> str = new Vector<>();



}
