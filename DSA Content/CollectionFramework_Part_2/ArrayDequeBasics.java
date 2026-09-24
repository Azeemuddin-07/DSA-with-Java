package CollectionFramework_Part_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(3);
        q.offerFirst(10);
        q.offer(8);
        q.offerLast(23);

        System.out.println("Printing ..." + q);

        // some method

        q.pollFirst();
        System.out.println("After poll : " + q);
        q.pollLast();
        System.out.println(q);

        System.out.println("Size of Queue : " + q.size());

        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());



    }
}
