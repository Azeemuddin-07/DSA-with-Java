package CollectionFramework_Part_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Basics {
    // priority que - jiska jyada priority wo pahle niklega
    public static void main() {
        // creation of priority queue

        Queue<Integer> pq = new PriorityQueue<>(); // yaha comparator likhe

        //default behaviour -> Integers (Case me) -> lesser value -> higher priority -> minHeap
        // minHeap matlab kam value wala ka priority jyada hoga
        // if minHeap ko , maxHeap me badalne ke liye ek comparator ki jarurat hoti hai.
        // comparator -: ((a, b)-> b-a) (ise lambda expression kahte h) ko likhna hoga create wala part me.

        pq.offer(32);
        pq.offer(28);
        pq.offer(25);
        pq.offer(21);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());





    }
}
