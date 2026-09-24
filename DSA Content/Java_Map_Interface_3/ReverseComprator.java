package Java_Map_Interface_3;

import java.util.Comparator;

public class ReverseComprator implements Comparator<Integer> {

    // create own comprator

        public int compare(Integer o1, Integer o2) {
            return 0-Integer.compare(o1, o2);
        }



}
