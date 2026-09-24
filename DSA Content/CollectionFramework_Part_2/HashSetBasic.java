package CollectionFramework_Part_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasic {
    public static void main() {
        // set store the unique value


        // HashedSet -> Time comp -> O(1) , because of randomness
        //LinkedHashedSet -> Time comp -> O(n) , because of shuru se ant tak jana
        // TreeSet -> Time comp -> BST -> O(log n )



        // creation of Hashedset
        System.out.println("Ye hai HashedSet ka concept. (Randomly store...) ");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(25);
        set.add(10);
        set.add(10);
        set.add(25);
        set.add(20);
        set.add(20);
        // HashSet stored the data in random space

        System.out.println(set);

        System.out.println("New concept is following");

        // concept of another method
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        // retainAll() - ye do set ke bich intersection batata hai
        // containsAll() - ye true/false deta hai do set ke bich ele ke maujud rahne par

        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.containsAll(set2)); // give false because all ele of set2 i.e 1,2,3,4 is not in set1 i,e 3,4

        System.out.println(set2.containsAll(set1)); // give true

        // HashCode()  is in next lecture



        // LinkedHashSet
        System.out.println("Ye hai LinkedHashSet ka concept. (Jo pahle aaye wo pahle store hoga) ");

        Set<Integer> st = new LinkedHashSet<>();
        st.add(40);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(25);
        st.add(38);
        st.add(10);
        st.add(25);
        st.add(20);
        st.add(20);
        // HashSet jo pahle add hua use pahle store karta hai

        System.out.println(st);





        // LinkedHashSet
        System.out.println("Ye hai TreeSet ka concept.(Always sorted in Ascending order) ");

        Set<Integer> tr = new TreeSet<>();
        tr.add(40);
        tr.add(10);
        tr.add(20);
        tr.add(20);
        tr.add(25);
        tr.add(38);
        tr.add(10);
        tr.add(25);
        tr.add(20);
        tr.add(20);
        // TreeSet hamesha sorted number me element store karta hai

        System.out.println(tr);




        //  Methods:

        //· Insertion: add(), addAll()

        //· Access: iterator()

        //· Removal: remove(), removeAll()

        //· Union - addAll()

        //.  Intersection - retainAll()

        //. Difference - removeAll()

        //· Subset - containsAll()




    }
}
