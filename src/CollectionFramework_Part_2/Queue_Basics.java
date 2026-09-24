package CollectionFramework_Part_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
public class Queue_Basics {
    // The queue interface of the java collections framework provides the functionality of the queue data strcture.
    // it extends the Collection interface.
    
    // Queue me add aur remove dono taraf se nahi kar sakte, But Doubly-ended-Queue (Deque) me dono taraf se kar sakte hai


    public static void main(String[] args ) {
        // create of Queue
        Queue<Integer> q = new LinkedList<>();
        // in case of queue, add give exception handling. so do not use add , use offer() method
        // replacement of method
        // do not use .add() <-> use .offer() //ye sab exception handling se bachne ke liye
        // do not use .element() <-> use .peek()
        // do not use remove() <-> use .poll()

        q.add(233);
        q.offer(232);
        q.offer(231);
        q.offer(230);
        System.out.println("Printing Queue : " + q);

        // in Queue - Insertion hamesha rear se hoga aur removal hamesha front se hoga
        q.offer(7);
        System.out.println("Adding... 7 : " + q);

        // pop()
        System.out.println("Removing : " + q.poll());

        //.peek()
        System.out.println("Peeking...: " + q.peek());







    }
}
